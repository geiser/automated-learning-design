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
import br.usp.ime.cg.automatedld.server.db.dao.ResourceDAO;

@Resource
@RequestScoped
public class ResourceController {
	
	private final ResourceDAO dao;
	private final Result result;
	
	public ResourceController(ResourceDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	@Get
	@Path(value = "/resources/list", priority=10)
	public void list(){
		List<br.usp.ime.cg.automatedld.server.model.Resource> resources = dao.listAll();
		result.include("resources", resources);
	}
	
	@Get
	@Path(value = "/resources/add", priority=1)
	public void edit() { }
	
	@Get
	@Path(value = "/resources/{key}/edit", priority=2)
	public void edit(Long key) {
		br.usp.ime.cg.automatedld.server.model.Resource resource = dao.findByKey(key);
		result.include("resource", resource);
	}
	
	@Get
	@Path(value = "/resources/{key}", priority=5)
	public void show(Long key) {
		br.usp.ime.cg.automatedld.server.model.Resource resource = dao.findByKey(key);
		result.include("resource", resource);
	}
	
	@Post
	@Path(value = "/resources/save")
	public void save(br.usp.ime.cg.automatedld.server.model.Resource resource) {
		dao.save(resource);
		result.use(Results.logic()).redirectTo(ResourceController.class).list();
	}
	
	@Delete
	@Path(value = "/resources/{key}")
	public void remove(Long key) {
		dao.remove(key);
		result.use(Results.logic()).redirectTo(ResourceController.class).list();
	}

	
}
