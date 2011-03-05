package br.usp.ime.cg.automatedld.server.model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.tencompetence.imsldmodel.ILDModel;
import org.tencompetence.imsldmodel.roles.ILearnerModel;
import org.tencompetence.imsldmodel.roles.impl.LearnerRoleModel;

import br.usp.ime.cg.automatedld.server.util.IMSManifest;

@Entity
public class LDPlan implements Serializable {

	private static final long serialVersionUID = 3743451140172515522L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToOne
	private LDOperator ldOperator;
	
	@OneToMany
	private List<Metadata> concepts = new ArrayList<Metadata>();
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLdOperator(LDOperator ldOperator) {
		this.ldOperator = ldOperator;
	}

	public LDOperator getLdOperator() {
		return ldOperator;
	}
	
	public void setConcepts(List<Metadata> concepts) {
		if (concepts != null) {
			List<Metadata> clone = new ArrayList<Metadata>(this.getConcepts());
			for (Metadata concept : clone) {
				this.removeConcept(concept);
			}
			for (Metadata concept: concepts) {
				this.addConcept(concept);
			}
		} else {
			this.concepts = new ArrayList<Metadata>(); 
		}
	}
	
	public List<Metadata> getConcepts() {
		return concepts;
	}
	
	public LDPlan addConcept(Metadata concept) {
		concepts.add(concept);
		return this;
	}
	
	public LDPlan removeConcept(Metadata concept) {
		concepts.remove(concept);
		return this;
	}
	
	public File toIMSManifest(String path) throws IOException {
		IMSManifest imsmanifest = new IMSManifest(path);
				
		ILDModel ldModel = (ILDModel) ldOperator.toIMS(imsmanifest.getLdModel());
		List<ILearnerModel> learners = new ArrayList<ILearnerModel>(ldModel.getRolesModel().getLearners());
		
		// .. add role to main --> for learner
		ILearnerModel roleModel = new LearnerRoleModel(imsmanifest.getLdModel());
		roleModel.setIdentifier("r-main-learner");
		roleModel.setTitle("Role principal all student");
		for (ILearnerModel learner : learners){
			ldModel.getRolesModel().removeChild(learner);
			
			learner.setParent(roleModel);
			roleModel.addChild(learner);
			//ldModel.getRolesModel().addChild(learner);
		}
		imsmanifest.getLdModel().getRolesModel().addChild(roleModel);
		
		ldModel.setURI("http://www.ime.usp.br/cg/automatedld/planner/" + this.getId());
		ldModel.setIdentifier("imsld-"+ name.replaceAll("\\s", ""));
		imsmanifest.saveModel();
		return new File(path);
	}

}