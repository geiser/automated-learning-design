package br.usp.ime.cg.automatedld.server.db.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.model.Metadata;
import br.usp.ime.cg.automatedld.server.model.Property;
import br.usp.ime.cg.automatedld.server.model.Relation;

@Component
@RequestScoped
public class MetadataDAO {

	public class MetadataQuery {

		private Map<String, Metadata> properties = new HashMap<String, Metadata>();
		private Map<String, Metadata> relations = new HashMap<String, Metadata>();

		public MetadataQuery addProperty(String name, Metadata value) {
			properties.put(name, value);
			return this;
		}

		public MetadataQuery addRelation(String name, Metadata value) {
			relations.put(name, value);
			return this;
		}

		@SuppressWarnings("unchecked")
		public List<Metadata> list(String type) {

			List<Metadata> metadatas = new ArrayList<Metadata>();

			// execute queries
			Query query = em.createQuery("SELECT x FROM " + Metadata.class.getName() + " x WHERE x.type=:type");

			if (!(properties.isEmpty() && relations.isEmpty())) {
				String inClause = "";
				String whereClause = "";

				for (String name : properties.keySet()) {
					inClause += ", IN(x.properties) y" + name;
					whereClause += " AND y" + name + ".name='" + name + "' AND y" + name + ".value=:" + name;
				}
				for (String name : relations.keySet()) {
					inClause += ", IN(x.relations) z" + name;
					whereClause += " AND z" + name + ".name='" + name + "' AND z" + name + ".value=:" + name;
				}

				String hsql = "SELECT x FROM " + Metadata.class.getName() + " x" + inClause + " WHERE x.type=:type " + whereClause;
				query = em.createQuery(hsql);
				for (String name : properties.keySet()) {
					Metadata value = properties.get(name);
					query = query.setParameter(name, value);
				}
				for (String name : relations.keySet()) {
					Metadata value = relations.get(name);
					query = query.setParameter(name, value);
				}
			}

			query.setParameter("type", type);

			// update complete values
			metadatas = (List<Metadata>) query.getResultList();
			return metadatas;
		}

		public Metadata find(String type) {
			return this.list(type).get(0);
		}

		@SuppressWarnings("unchecked")
		public Metadata find(String type, String identifier) {
			Query query = em.createQuery("SELECT x FROM " + Metadata.class.getName() + " x WHERE x.type=:type AND x.identifier=:identifier");
			query.setParameter("type", type);
			query.setParameter("identifier", identifier);
			return ((List<Metadata>) query.getResultList()).get(0);
		}

	}

	private final EntityManager em;

	public MetadataDAO(final EntityManager em) {
		this.em = em;
	}
 
	public Metadata save(Metadata metadata) {
		// save new metadatas of properties
		if (metadata.getId() != null) {
			List<Property> foundProperties = em.find(Metadata.class, metadata.getId()).getProperties();
			for (Property property: foundProperties) {
				if (!metadata.getPropertiesPK().contains(property.getId())) {
					em.remove(property);
				}
			}
		}
		for (Property property : metadata.getProperties()) {
			if (property.getResource() != null && property.getResource().getId() == null) {
				Metadata resource = property.getResource();
				resource = this.save(resource);
				property.setResource(resource);
			}
		}
		
		// save new metatatas in relations
		if (metadata.getId() != null) {
			List<Relation> foundRelations = em.find(Metadata.class, metadata.getId()).getRelations();
			for (Relation relation: foundRelations) {
				if (!metadata.getRelationsPK().contains(relation.getId())) {
					em.remove(relation);
				}
			}
		}
		for (Relation relation : metadata.getRelations()) {
			if (relation.getValue() != null && relation.getValue().getId() == null) {
				Metadata value = relation.getValue();
				value = this.save(value);
				relation.setValue(value);
			}
		}
		
		
		// save metadata
		if (metadata.getId() != null) {
			metadata = em.merge(metadata);
		} else {
			em.persist(metadata);
		}
		return metadata;
	}

	public MetadataQuery buildQuery() {
		return new MetadataQuery();
	}

	public Metadata findByKey(Long id) {
		Metadata metadata = null;
		metadata = em.find(Metadata.class, id);
		return metadata;
	}

	public void remove(Long id){
		Metadata metadata = em.find(Metadata.class, id);
		if (metadata != null) {
			remove(metadata);
		}
	}

	@SuppressWarnings("unchecked")
	public void remove(Metadata metadata) {
		// remove related properties
		List<Property> properties = (List<Property>) em.createQuery("SELECT x FROM " + Property.class.getName() + " x WHERE x.resource=:resource")
		.setParameter("resource", metadata).getResultList();
		for (Property property : properties) {
			em.remove(property);
		}
		
		// remove related relations
		List<Relation> relations = (List<Relation>) em.createQuery("SELECT x FROM " + Relation.class.getName() + " x WHERE x.value=:value")
		.setParameter("value", metadata).getResultList();
		for (Relation relation : relations) {
			em.remove(relation);
		}
		
		em.remove(metadata);
	}

	@SuppressWarnings("unchecked")
	public List<Metadata> listAll() {
		List<Metadata> metadatas = new ArrayList<Metadata>();
		Query query = em.createQuery("SELECT x FROM " + Metadata.class.getName() + " x");
		metadatas = (List<Metadata>) query.getResultList();
		return metadatas;
	}

}