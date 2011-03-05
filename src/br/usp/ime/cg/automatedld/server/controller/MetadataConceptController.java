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
public class MetadataConceptController {
	
	private final MetadataDAO dao;
	private final Result result;
	
	public MetadataConceptController(MetadataDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value="/metadatas/concepts", priority=1)
	public void list() {
		List<Metadata> metadatas = dao.buildQuery().list("concept");
		result.include("metadatas", metadatas);
	}
	
	@Get
	@Path(value="/metadatas/concepts/add", priority=1)
	public void show() {
		List<Metadata> concepts = dao.buildQuery().list("concept");
		List<Metadata> competences = dao.buildQuery().list("competence");
		result.include("concepts", concepts);
		result.include("competences", competences);
	}
	
	@Get
	@Path(value="/metadatas/concepts/{key}", priority=2)
	public void show(Long key) {
		Metadata metadata = dao.findByKey(key);
		List<Metadata> concepts = dao.buildQuery().list("concept");
		List<Metadata> competences = dao.buildQuery().list("competence");
		result.include("metadata", metadata);
		result.include("concepts", concepts);
		result.include("competences", competences);
	}
	
	@Post
	@Path(value="/metadatas/concepts")
	public void save(Metadata metadata, List<Property> properties, List<Relation> relations) {
		metadata.setProperties(properties);
		metadata.setRelations(relations);
		dao.save(metadata);
		result.use(Results.logic()).redirectTo(MetadataConceptController.class).list();
	}
	
	@Delete
	@Path(value="/metadatas/concepts/{key}")
	public void remove(Long key) {
		dao.remove(key);
		result.use(Results.logic()).redirectTo(MetadataConceptController.class).list();
	}
	
}
