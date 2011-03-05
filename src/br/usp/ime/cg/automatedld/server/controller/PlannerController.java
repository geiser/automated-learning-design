package br.usp.ime.cg.automatedld.server.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.coppercore.dto.RunDto;
import org.coppercore.dto.RunParticipationDTO;
import org.coppercore.dto.UolDto;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdmin;
import localhost.CopperCoreSoap.services.CopperCoreAdmin.CopperCoreAdminProxy;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.db.dao.LDPlanDAO;
import br.usp.ime.cg.automatedld.server.db.dao.MetadataDAO;
import br.usp.ime.cg.automatedld.server.model.LDOperator;
import br.usp.ime.cg.automatedld.server.model.LDOperator.OperatorType;
import br.usp.ime.cg.automatedld.server.model.LDParameter;
import br.usp.ime.cg.automatedld.server.model.LDPlan;
import br.usp.ime.cg.automatedld.server.model.Metadata;
import br.usp.ime.cg.automatedld.server.model.Property;
import br.usp.ime.cg.automatedld.server.planner.JSHOP2Provider;
import br.usp.ime.cg.automatedld.server.planner.coursegeneration;
import br.usp.ime.cg.automatedld.server.util.LDPlanFactory;

import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.DoubleCost;
import com.gamalocus.jshop2rt.JSHOP2;
import com.gamalocus.jshop2rt.Predicate;
import com.gamalocus.jshop2rt.State;
import com.gamalocus.jshop2rt.TaskAtom;
import com.gamalocus.jshop2rt.TaskList;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermList;

@Resource
@RequestScoped
public class PlannerController {

	private final Domain domain;
	private final Result result;
	private final MetadataDAO metadataDAO;
	private final LDPlanDAO dao;
	
	private final String realBasePath;
	private final String httpBasePath;

	@SuppressWarnings("deprecation")
	public PlannerController(Result result, MetadataDAO metadataDAO, LDPlanDAO dao, HttpServletRequest request) {
		this.domain = new coursegeneration();
		this.result = result;
		this.metadataDAO = metadataDAO;
		this.dao = dao;
		this.realBasePath = request.getRealPath("/");
		this.httpBasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	}


	@Get
	@Path(value = "/planner")
	public void listPlan() {
		List<LDPlan> plans= dao.list();
		result.include("planList", plans);
	}


	@Get
	@Path(value = "/planner/{id}")
	public void getPlan(Long id) {
		LDPlan plan = dao.findByKey(id);
		result.include("plan", plan);
	}

	@Get
	@Path(value = "/planner/{id}/ims-cp.zip")
	public File getIMSPackage(Long id) throws IOException {
		File imsmanifest = getIMSLD(id);
		String target = realBasePath + "ims-cp" + id + ".zip";
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(target));

		byte[] buffer = new byte[10240];
//		for (String activityName : IMSManifest.learningActivities) {
//            FileInputStream in = new FileInputStream(realBasePath + activityName);
//            out.putNextEntry(new ZipEntry(activityName));
//            int len;
//            while ((len = in.read(buffer)) > 0) {
//                out.write(buffer, 0, len);
//            }
//            out.closeEntry();
//            in.close();
//        }
		
		FileInputStream in = new FileInputStream(imsmanifest.getAbsolutePath());
		out.putNextEntry(new ZipEntry("imsmanifest.xml"));
		int len;
		while ((len = in.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
		out.closeEntry();
		in.close();
		
		out.close();
		return new File(target);
	}

	@Get
	@Path(value = "/planner/{id}/imsld")
	public File getIMSLD(Long id) throws IOException  {
		String path = realBasePath + "imsmanifest"+id+".xml";
		LDPlan ldPlan = dao.findByKey(id);
		return ldPlan.toIMSManifest(path);
	}

	
	@Get
	@Path(value = "/planner/{id}/xslt")
	public void xslt(Long id) {
		result.include("id", id);
	}
	
	@Post
	@Path(value = "/planner")
	public void doPlan(List<Metadata> concepts, List<Metadata> learners, String name) {
		
		State state = new State(domain.getAxioms());
		
		Term conceptTerms = TermList.NIL;
		Term learnerTerms = TermList.NIL;
		Term competenceTerms = TermList.NIL;
		Term resourceTerms = TermList.NIL;
		
		// add concepts
		for (Metadata concept: concepts) {
			Metadata foundConcept = metadataDAO.findByKey(concept.getId());
			state = LDPlanFactory.addMetadataToState(foundConcept, state, domain);
			
			conceptTerms = new TermList(domain.getTermConstant(domain.addConstant(foundConcept.getIdentifier())), conceptTerms);
			List<Property> objectives = foundConcept.getProperties("hasObjective");
			for (Property objective : objectives) {
				competenceTerms = new TermList(domain.getTermConstant(domain.addConstant(objective.getResource().getIdentifier())), competenceTerms);
			}
		}
		// add learners
		for (Metadata learner: learners) {
			Metadata foundLearner = metadataDAO.findByKey(learner.getId());
			state = LDPlanFactory.addMetadataToState(foundLearner, state, domain);
			
			learnerTerms = new TermList(domain.getTermConstant(domain.addConstant(foundLearner.getIdentifier())), learnerTerms);
		}
		
		// add resources (this data must be insert in application context)
		List<Metadata> resources = metadataDAO.buildQuery().list("resource");
		for (Metadata resource: resources) {
			state = LDPlanFactory.addMetadataToState(resource, state, domain);
			
			resourceTerms = new TermList(domain.getTermConstant(domain.addConstant(resource.getIdentifier())), resourceTerms);
		}
		
		state.add(new Predicate(domain.addConstant("concepts"), 0, new TermList(conceptTerms, TermList.NIL)));
		state.add(new Predicate(domain.addConstant("learners"), 0, new TermList(learnerTerms, TermList.NIL)));
		state.add(new Predicate(domain.addConstant("resources"), 0, new TermList(resourceTerms, TermList.NIL)));
		state.add(new Predicate(domain.addConstant("competences"), 0, new TermList(competenceTerms, TermList.NIL)));
		
		// set initial task T
		TaskList tasksIn = new TaskList(1, true);
		tasksIn.subtasks[0] = new TaskList(new TaskAtom(new Predicate(domain.getCompoundTaskIndex("generatecourse"), 0, TermList.NIL), false, false));

		// get plans
		int n = 0;
		JSHOP2 jShop2Planner = new JSHOP2(tasksIn, 100000, new DoubleCost(0.0), domain, state);
		JSHOP2Provider.setJSHOP2(jShop2Planner);
		JSHOP2Provider.setBasePath(this.httpBasePath);
		
		System.out.println("initial state -> ");
		jShop2Planner.getState().print(domain);
		//System.out.println("initial task -> " + tasksIn.toString(domain));
		while (jShop2Planner.run()) {
			//if (n%100 == 0 ) System.out.println("current plan <<< \n"+jShop2Planner.getCurrentPlan().toString(domain));
			if (jShop2Planner.getPlans().size() > 0) break;
			n++;
		}
		
		System.out.println(jShop2Planner.getPlans().getFirst().toString(domain));

		//.. process planner
		LDPlan plan = LDPlanFactory.makePlan(jShop2Planner.getPlans().getFirst(), domain);
		plan.setName(name);
		dao.save(plan);
	}

	@Get
	@Path(value = "/planner/{id}/publish")
	public void publish(Long id) throws IOException {

		LDPlan ldPlan = dao.findByKey(id);

		CopperCoreAdmin coppercore = new CopperCoreAdminProxy();        

		// publish in copper-core
		File imscp =  this.getIMSPackage(id);
		FileInputStream in = new FileInputStream(imscp.getAbsolutePath());
		byte[] buffer = new byte[10240];
		if (in.read(buffer)>0) {
			coppercore.publish(buffer, imscp.getName());
		}
		in.close();

		UolDto[] uol = coppercore.listUols();
		int uolId = 0;
		for (UolDto uolDto : uol) {
			String uri = "http://www.ime.usp.br/cg/automatedld/planner/" + id;
			if (uri.equals(uolDto.getUri())) {
				uolId = uolDto.getId();
			}
			System.out.println("===== Uol =====");
			System.out.println("title: " + uolDto.getTitle());
			System.out.println("Uri: " + uolDto.getUri());
			System.out.println("ContentUri: " + uolDto.getContentUri());
		}

		RunDto in0 = new RunDto();
		in0.setUolId(uolId);
		in0.setTitle("http://www.ime.usp.br/cg/automatedld/planner/" + id);
		int runId = 0;
		try {
			runId = coppercore.createRun(in0);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			addUsersAndRolesRecursive(ldPlan.getLdOperator(), coppercore, runId);
			addUsersToDefaultRole(coppercore, runId);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void addUsersToDefaultRole(CopperCoreAdmin coppercore, int runId) throws RemoteException {
		RunParticipationDTO[] usersDTO = coppercore.listUsersInRun(runId);
		for (RunParticipationDTO runParticipationDTO : usersDTO) {
			
			String userId = runParticipationDTO.getUserId();
			
			// add user to role with same name
			// TODO refactoring this method ...
			Document document = null;
			try {
				document = DocumentHelper.parseText(coppercore.getRolesTree(runId));
				@SuppressWarnings("unchecked")
				// change this method must be more general
				Iterator<Element> learnersXML = ((Element) document.getRootElement().elementIterator().next()).elementIterator();
				
				int roleId = 0;
				while (learnersXML.hasNext() && roleId == 0) {
					Element roleElement = learnersXML.next();
					if (roleElement.getName().equals("learner") && userId.replaceAll("\\@","").replaceAll("\\.", "").equals(roleElement.attributeValue("org-identifier"))){
						roleId = Integer.parseInt(roleElement.attributeValue("identifier"));
					}

				}
				if (roleId != 0) {
					coppercore.addUserToRole(userId, roleId);
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	private void addUsersAndRolesRecursive(LDOperator operator, CopperCoreAdmin coppercore, int runId) throws RemoteException {
		for (LDOperator child : operator.getPlan()) {
			addUsersAndRolesRecursive(child, coppercore, runId);
		}
		if (operator.getType().equals(OperatorType.ADD_USER_TO_ROLE)) {
			String userId = null;
			String roleName = null;

			List<LDParameter> parameters = operator.getParameters();
			for (LDParameter ldParameter : parameters) {
				if ("user".equals(ldParameter.getName())){
					userId = ldParameter.getValue();
				} else if ("role".equals(ldParameter.getName())) {
					roleName = ldParameter.getValue();
				}
			}


			if ((userId != null) && (roleName !=null)) {
				List<String> users = Arrays.asList(coppercore.listUsers());
				if (!users.contains(userId)) { coppercore.createUser(userId); }

				List<RunParticipationDTO> usersInRun = Arrays.asList(coppercore.listUsersInRun(runId));
				List<String> usersIdInRun = new ArrayList<String>();
				for (RunParticipationDTO runParticipationDTO : usersInRun) {
					usersIdInRun.add(runParticipationDTO.getUserId());
				}
				if (!usersIdInRun.contains(userId)) {
					coppercore.addUserToRun(userId, runId);
				}

				Document document = null;
				try {
					document = DocumentHelper.parseText(coppercore.getRolesTree(runId));
					@SuppressWarnings("unchecked")
					// change this method must be more general
					Iterator<Element> learnersXML = ((Element) document.getRootElement().elementIterator().next()).elementIterator();
					
					int roleId = 0;
					while (learnersXML.hasNext() && roleId == 0) {
						Element roleElement = learnersXML.next();
						if (roleElement.getName().equals("learner") && roleName.equals(roleElement.attributeValue("org-identifier"))){
							roleId = Integer.parseInt(roleElement.attributeValue("identifier"));
						}

					}
					if (roleId != 0) {
						coppercore.addUserToRole(userId, roleId);
					}
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
