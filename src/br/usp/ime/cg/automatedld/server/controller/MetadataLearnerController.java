package br.usp.ime.cg.automatedld.server.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.view.Results;
import br.usp.ime.cg.automatedld.server.db.dao.MetadataDAO;
import br.usp.ime.cg.automatedld.server.model.Metadata;
import br.usp.ime.cg.automatedld.server.model.Property;
import br.usp.ime.cg.automatedld.server.model.Relation;

@Resource
@RequestScoped
public class MetadataLearnerController {
	
	private final MetadataDAO dao;
	private final Result result;
	
	public MetadataLearnerController(MetadataDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value="/metadatas/learners", priority=1)
	public void list() {
		List<Metadata> metadatas = dao.buildQuery().list("learner");
		result.include("metadatas", metadatas);
	}
	
	@Get
	@Path(value="/metadatas/learners/add", priority=1)
	public void show() {
		List<Metadata> competences = dao.buildQuery().list("competence");
		List<Metadata> resources = dao.buildQuery().list("resource");
		result.include("competences", competences);
		result.include("resources", resources);
	}
	
	@Get
	@Path(value="/metadatas/learners/{key}", priority=2)
	public void show(Long key) {
		Metadata metadata = dao.findByKey(key);
		List<Metadata> competences = dao.buildQuery().list("competence");
		List<Metadata> resources = dao.buildQuery().list("resource");
		result.include("metadata", metadata);
		result.include("competences", competences);
		result.include("resources", resources);
	}
	
	@Post
	@Path(value="/metadatas/learners")
	public void save(Metadata metadata, List<Property> properties, List<Relation> relations) {
		metadata.setProperties(properties);
		metadata.setRelations(relations);
		
		// update education level
		Property property = metadata.getPropertyMap().get("hasEducationalLevel").get(0);
		Property hasAllowedEducationalLevel = metadata.getPropertyMap().get("hasAllowedEducationalLevel").get(0);
		if ("school".equals(property.getValue())) {
			hasAllowedEducationalLevel.setValue("") ;
		} else if ("higherEducation".equals(metadata.getPropertyMap().get("hasEducationalLevel").get(0).getValue())) {
			hasAllowedEducationalLevel.setValue("school") ;
		} else  if ("training".equals(metadata.getPropertyMap().get("hasEducationalLevel").get(0).getValue())) {
			hasAllowedEducationalLevel.setValue("school;higherEducation") ;
		} else if ("other".equals(metadata.getPropertyMap().get("hasEducationalLevel").get(0).getValue())) {
			hasAllowedEducationalLevel.setValue("school;higherEducation;training") ;
		}
		
		dao.save(metadata);
		result.use(Results.logic()).redirectTo(MetadataLearnerController.class).list();
	}
	
	@Delete
	@Path(value="/metadatas/learners/{key}")
	public void remove(Long key) {
		dao.remove(key);
		result.use(Results.logic()).redirectTo(MetadataLearnerController.class).list();
	}
	
}
