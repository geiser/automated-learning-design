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
public class MetadataCompetenceController {
	
	private final MetadataDAO dao;
	private final Result result;
	
	public MetadataCompetenceController(MetadataDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value="/metadatas/competences", priority=1)
	public void list() {
		List<Metadata> metadatas = dao.buildQuery().list("competence");
		result.include("metadatas", metadatas);
	}
	
	@Get
	@Path(value="/metadatas/competences/add", priority=1)
	public void show() {
		List<Metadata> skills = dao.buildQuery().list("skill");
		List<Metadata> knowledges = dao.buildQuery().list("knowledge");
		result.include("skills", skills);
		result.include("knowledges", knowledges);
	}
	
	@Get
	@Path(value="/metadatas/competences/{key}", priority=2)
	public void show(Long key) {
		Metadata metadata = dao.findByKey(key);
		List<Metadata> skills = dao.buildQuery().list("skill");
		List<Metadata> knowledges = dao.buildQuery().list("knowledge");
		result.include("metadata", metadata);
		result.include("skills", skills);
		result.include("knowledges", knowledges);
	}
	
	@Post
	@Path(value="/metadatas/competences")
	public void save(Metadata metadata, List<Property> properties, List<Relation> relations) {
		metadata.setProperties(properties);
		metadata.setRelations(relations);
		dao.save(metadata);
		result.use(Results.logic()).redirectTo(MetadataCompetenceController.class).list();
	}
	
	@Delete
	@Path(value="/metadatas/competences/{key}")
	public void remove(Long key) {
		dao.remove(key);
		result.use(Results.logic()).redirectTo(MetadataCompetenceController.class).list();
	}
	
}
