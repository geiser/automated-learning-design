package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Property implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(optional=true)
	private Metadata metadata;
	
	@Column(nullable=false)
	private String name = "";
	
	@ManyToOne(optional=true)
	private Metadata resource;
	
	@Column(nullable=true)
	private String value;
	
	public Property() { }
	
	public Property(String name, String value){
		this(null, name, null, value);
	}
	
	public Property(String name, Metadata resource) {
		this(null, name, resource, "");
	}
	
	public Property(String name, Metadata resource, String value) {
		this(null, name, resource, value);
	}
	
	public Property(Metadata metadata, String name, Metadata resource, String value) {
		this.setMetadata(metadata);
		this.setName(name);
		this.setResource(resource);
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
	
	public void setResource(Metadata resource) {
		this.resource = resource;
	}
	
	public Metadata getResource() {
		return resource;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	/*---------------------------------------------------------------------------*/
	
	@Override
	public int hashCode(){
		int toReturn = 1;
		if (this.id != null) return this.id.hashCode();
		if (this.metadata != null) toReturn *= this.metadata.hashCode();
		if (this.name != null) toReturn *= this.name.hashCode();
		if (this.resource != null && this.resource.getId() != null) toReturn *= this.resource.getId().hashCode();
		if (this.value != null) toReturn *= this.value.hashCode();
		return toReturn;
	}
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (!(obj instanceof Property) || (obj == null)) { return false; }
        Property property = (Property) obj;
        if (this.id != null) return this.id.equals(property.getId());
        return (this.metadata != null && this.metadata.equals(property.getMetadata())) &&
        		(this.name != null && this.name.equals(property.getName())) &&
        		((this.resource != null && this.resource.getId() != null) ? this.resource.equals(property.getResource()) : true) &&
        		(this.value != null && this.value.equals(property.getValue()));
    }
	
	@Override
	public String toString() {
		// (property (type ?identifier) ?name (type ?value))
		// e.g: (property (knowledge ?identifier) hasLearningContext (null null) training)),
		//      (property (concept ?identifier) hasPrerequisite (knowledge http://www.ime.usp.br/knowledge/1) null)
		return "(property " +
				"(" + (this.metadata != null ? this.metadata.getType() + " " + this.metadata.getIdentifier() : "null null") + ")" +
				" " + this.name.toString() + " " +
				"(" + (this.resource != null ? this.resource.getType() + " " + this.resource.getIdentifier() : " null null") + ")" +
				" " + (this.value != null ? this.value.toString() : "null") + ")";
	}
	
}
