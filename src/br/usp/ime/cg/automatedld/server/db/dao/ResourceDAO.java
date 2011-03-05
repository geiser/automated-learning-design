package br.usp.ime.cg.automatedld.server.db.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.model.Resource;

@Component
@RequestScoped
public class ResourceDAO {

	private final EntityManager em;

	public ResourceDAO(final EntityManager em) {
		this.em = em;
	}
 
	public Resource save(Resource resource) {
		if (resource.getId() != null) {
			resource = em.merge(resource);
		} else {
			em.persist(resource);
		}
		return resource;
	}

	public Resource findByKey(Long id) {
		Resource resource = null;
		resource = em.find(Resource.class, id);
		return resource;
	}

	public void remove(Long id){
		Resource resource = em.find(Resource.class, id);
		if (resource != null) {
			remove(resource);
		}
	}

	public void remove(Resource resource) {
		em.remove(resource);
	}

	@SuppressWarnings("unchecked")
	public List<Resource> listAll() {
		List<Resource> resources = new ArrayList<Resource>();
		Query query = em.createQuery("SELECT x FROM " + Resource.class.getName() + " x");
		resources = (List<Resource>) query.getResultList();
		return resources;
	}

}