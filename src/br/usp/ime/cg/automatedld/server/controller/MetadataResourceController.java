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
public class MetadataResourceController {
	
	private final MetadataDAO dao;
	private final Result result;
	
	public MetadataResourceController(MetadataDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value="/metadatas/resources", priority=1)
	public void list() {
		List<Metadata> metadatas = dao.buildQuery().list("resource");
		result.include("metadatas", metadatas);
	}
	
	@Get
	@Path(value="/metadatas/resources/add", priority=1)
	public void show() {
		List<Metadata> resources = dao.buildQuery().list("resource");
		List<Metadata> competences = dao.buildQuery().list("competence");
		result.include("resources", resources);
		result.include("competences", competences);
	}
	
	@Get
	@Path(value="/metadatas/resources/{key}", priority=2)
	public void show(Long key) {
		Metadata metadata = dao.findByKey(key);
		List<Metadata> resources = dao.buildQuery().list("resource");
		List<Metadata> competences = dao.buildQuery().list("competence");
		result.include("metadata", metadata);
		result.include("resources", resources);
		result.include("competences", competences);
	}
	
	@Post
	@Path(value="/metadatas/resources")
	public void save(Metadata metadata, List<Property> properties, List<Relation> relations) {
		metadata.setProperties(properties);
		metadata.setRelations(relations);
		dao.save(metadata);
		result.use(Results.logic()).redirectTo(MetadataResourceController.class).list();
	}
	
	@Delete
	@Path(value="/metadatas/resources/{key}")
	public void remove(Long key) {
		dao.remove(key);
		result.use(Results.logic()).redirectTo(MetadataResourceController.class).list();
	}
	
}
