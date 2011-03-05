package br.usp.ime.cg.automatedld.server.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.db.dao.MetadataDAO;
import br.usp.ime.cg.automatedld.server.model.Metadata;

@Resource
@RequestScoped
public class MetadataController {
	
	private final MetadataDAO dao;
	private final Result result;
	
	public MetadataController(MetadataDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value = "/metadatas/{key}", priority=5)
	public void show(Long key) {
		Metadata metadata = dao.findByKey(key);
		result.include("metadata", metadata);
	}

//	@Get
//	@Path(value = "/metadatas", priority=10)
//	public void list(){
//		List<Metadata> metadatas = dao.listAll();
//		result.include("metadatas", metadatas);
//	}
	
	@Get
	@Path(value = "/metadatas", priority=10)
	public void list(String id) {
		List<Metadata> metadatas = new ArrayList<Metadata>(); 
		if (id!=null && !id.isEmpty()) {
			metadatas = dao.buildQuery().list(id);
		} else {
			metadatas.add(new Metadata("folder", "concept"));
			metadatas.add(new Metadata("folder", "competence"));
			metadatas.add(new Metadata("folder", "skill"));
			metadatas.add(new Metadata("folder", "knowledge"));
			metadatas.add(new Metadata("folder", "resource"));
			metadatas.add(new Metadata("folder", "learner"));
		}
		result.include("metadatas", metadatas);
	}
	
}
