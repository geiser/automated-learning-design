package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Relation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	private Long id;
	
	@ManyToOne(optional=true)
	private Metadata metadata;
	
	private String name = "";
	
	@ManyToOne(optional=true)
	private Metadata value;
	
	public Relation() { }
	
	public Relation(String name, Metadata value){
		this(null, name, value);
	}
	
	public Relation(Metadata metadata, String name, Metadata value) {
		this.setMetadata(metadata);
		this.setName(name);
		this.setValue(value);
	}
	
	/*---------------------------------------------------------------------------*/

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	
	public Metadata getMetadata() {
		return this.metadata;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setValue(Metadata value) {
		this.value = value;
	}
	
	public Metadata getValue() {
		return value;
	}
	
	/*---------------------------------------------------------------------------*/
	
	@Override
	public int hashCode(){
		int toReturn = 1;
		if (this.id != null) return this.id.hashCode();
		if (this.name != null) toReturn *= this.name.hashCode();
		if (this.value != null && this.value.getId() != null) toReturn *= this.value.getId().hashCode();
		return toReturn;
	}
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (!(obj instanceof Relation) || (obj == null)) { return false; }
        Relation relation = (Relation) obj;
        if (this.id != null) return this.id.equals(relation.getId());
        return (this.metadata != null && this.metadata.equals(relation.getMetadata())) &&
        		(this.name != null && this.name.equals(relation.getName())) &&
        		((this.value != null && this.value.getId() != null) ? this.id.equals(relation.getId()) : true);
    }
	
	@Override
	public String toString() {
		// (relation (type ?identifier) ?name (type ?value))
		// e.g: (relation (knowledge ?identifier) hasLearningContext (String training)),
		//      (relation (concept ?identifier) hasPrerequisite (knowledge http://www.ime.usp.br/knowledge/1))
		return "(relation " +
				"(" + (this.metadata != null ? this.metadata.getType() + " " + this.metadata.getIdentifier() : "null null") + ")" +
				" " + this.name.toString() + " " +
				"(" + (this.value != null ? this.value.getType() + " " + this.value.getIdentifier() : " null null") + "))";
	}
	
}