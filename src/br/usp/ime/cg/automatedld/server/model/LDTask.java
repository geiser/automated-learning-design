package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LDTask implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private Long id;
	
	private String task;

	@OneToMany(mappedBy="task", cascade=CascadeType.ALL)
	private List<JShopParam> params = new ArrayList<JShopParam>();
	
	@OneToOne(optional=false, mappedBy="task")
	private LDOperator operator;
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setParams(List<JShopParam> params) {
		List<JShopParam> clone = new ArrayList<JShopParam>(this.params);
		for (JShopParam param : clone) {
			this.removeParam(param);
		}
		for (JShopParam param : params) {
			this.addParam(param);
		}
		this.params = params;
	}

	public void setOperator(LDOperator operator) {
		this.operator = operator;
		if (this.operator.getTask() == null) {
			this.operator.setTask(this);
		}
	}
	
	public LDOperator getOperator() {
		return operator;
	}
	
	public List<JShopParam> getParams() {
		return params;
	}
	
	public LDTask addParam(JShopParam param) {
		params.add(param);
		param.setTask(this);
		return this;
	}
	
	public LDTask removeParam(JShopParam param) {
		params.remove(param);
		param.setTask(null);
		return this;
	}
	
}
