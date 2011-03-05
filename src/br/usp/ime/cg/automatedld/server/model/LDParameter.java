package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class LDParameter implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private Long id;
	
	private String name;
	
	private String value;
	
	public LDParameter() { }
	
	public LDParameter(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@ManyToOne(optional=true)
	private LDOperator operator;
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setOperator(LDOperator operator) {
		this.operator = operator;
	}

	public LDOperator getOperator() {
		return operator;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) { return true; }
		if (!(obj instanceof LDParameter) || (obj == null)) { return false; }
		LDParameter ldParameter = (LDParameter) obj;
		if (this.id != null) return this.id.equals(ldParameter.getId());
		if (obj instanceof LDParameter) return ldParameter.getName().equals(this.getName());
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
}
