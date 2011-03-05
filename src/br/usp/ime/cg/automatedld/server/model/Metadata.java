package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Metadata implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String type;
	
	private String identifier = "";
	
	@OneToMany(mappedBy="metadata", cascade=CascadeType.ALL)
	private List<Property> properties = new ArrayList<Property>();

	@OneToMany(mappedBy="metadata", cascade=CascadeType.ALL)
	private List<Relation> relations = new ArrayList<Relation>();
	
	public Metadata() { }
	
	public Metadata(String type, String identifier) {
		this.type = type;
		this.identifier = identifier;
	}
	
	/*---------------------------------------------------------------------------*/
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public Metadata setType(String type) {
		this.type = type;
		return this;
	}

	public String getType(){
		return this.type;
	}

	public Metadata setIdentifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public Metadata setProperties(List<Property> properties) {
		if (properties != null) {
			List<Property> clone = new ArrayList<Property>(this.getProperties());
			for (Property property : clone) {
				this.removeProperty(property);
			}
			for (Property property: properties) {
				this.addProperty(property);
			}
		} else {
			this.properties = new ArrayList<Property>(); 
		}
		return this;
	}
	
	public List<Property> getProperties() {
		return properties;
	}
	
	public Map<String, List<Property>> getPropertyMap() {
		Map<String, List<Property>> toReturn = new HashMap<String, List<Property>>();
		for (Property property : this.getProperties()) {
			List<Property> list = toReturn.get(property.getName());
			if (list == null) { list = new ArrayList<Property>(); }
			if (list.contains(property)) { list.remove(property); }
			list.add(property);
			toReturn.put(property.getName(), list);
		}
		return toReturn;
	}

	public Metadata addProperty(Property property) {
		this.properties.add(property);
		property.setMetadata(this);
		return this;
	}
	
	public Metadata removeProperty(Property property) {
		this.properties.remove(property);
		property.setMetadata(null);
		return this;
	}
	
	public Metadata setRelations(List<Relation> relations) {
		if (relations != null) {
			List<Relation> clone = new ArrayList<Relation>(this.getRelations());
			for (Relation relation : clone) { this.removeRelation(relation); }
			for (Relation relation : relations) { this.addRelation(relation); }
		} else {
			this.relations = new ArrayList<Relation>();
		}
		return this;
	}
	
	public List<Relation> getRelations() {
		return this.relations;
	}
	
	public Map<String, List<Relation>> getRelationMap() {
		Map<String, List<Relation>> toReturn = new HashMap<String, List<Relation>>();
		for (Relation relation : this.getRelations()) {
			List<Relation> list = toReturn.get(relation.getName());
			if (list == null) { list = new ArrayList<Relation>(); }
			if (list.contains(relation)) { list.remove(relation); }
			list.add(relation);
			toReturn.put(relation.getName(), list);
		}
		return toReturn;
	}
	
	public Metadata addRelation(Relation relation) {
		this.relations.add(relation);
		relation.setMetadata(this);
		return this;
	}

	public Metadata removeRelation(Relation relation) {
		this.relations.remove(relation);
		relation.setMetadata(null);
		return this;
	}

	/*---------------------------------------------------------------------------*/

	public List<Property> getProperties(String name) {
		return this.getPropertyMap().get(name);
	}
	
	public List<Relation> getRelations(String name) {
		return this.getRelationMap().get(name);
	}
	
	/*---------------------------------------------------------------------------*/
	
	@Override
	public int hashCode() {
		int toReturn = 1;
		if (this.id != null) return this.id.hashCode();
		if (this.type != null) toReturn *= this.type.hashCode();
		if (this.identifier != null) toReturn *= this.identifier.hashCode();
		return toReturn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) { return true; }
		if (!(obj instanceof Metadata) || (obj == null)) { return false; }
		Metadata metadata = (Metadata) obj;
		if (this.id != null) return this.id.equals(metadata.getId());
		boolean toReturn = this.type.equals(metadata.getType()) &&
							this.identifier.equals(metadata.getIdentifier());
		return toReturn;
	}
	
	@Override
	public String toString() {
		// (predicate ?identifier ?p1 ?p2 ... ?r1 ?r2 ...)
		// e.g: (knowledge ?identifier (property (knowledge ?id) title knowledge1)
		//			(property (knowledge ?id) hasLearningContext school)
		//          ...
		//			(relation (knowledge ?id) hasEducatonalObjective (knowledge http://wada.com/mixtrua/n)))
		String toReturn = (this.type != null ? this.type.toString() : "null") + " " +
						(this.identifier != null ? this.identifier.toString(): "null");
		for (Property property : this.properties) {
			toReturn += " " + property.toString();
		}
		for (Relation relation : this.relations) {
			toReturn += " " + relation.toString();
		}
		return "(" + toReturn + ")";
	}

	public List<Long> getRelationsPK() {
		List<Long> toReturn = new ArrayList<Long>();
		for(Relation relation : this.getRelations()) {
			if (relation.getId() != null) {
				toReturn.add(relation.getId());
			}
		}
		return toReturn;
	}
	
	public List<Long> getPropertiesPK() {
		List<Long> toReturn = new ArrayList<Long>();
		for(Property property : this.getProperties()) {
			if (property.getId() != null) {
				toReturn.add(property.getId());
			}
		}
		return toReturn;
	}
	
}