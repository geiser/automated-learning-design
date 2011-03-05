package br.usp.ime.cg.automatedld.server.model;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.usp.ime.cg.automatedld.server.model.LDOperator.OperatorType;

@Entity
public class JShopParam {
	
	public enum JShopParamType {

		TERMNUMBER ("TermNumber"),
		TERMCONSTANT ("TermConstant"),
		TERMLIST ("TermList");

		private String value;

		JShopParamType(String value) {
			this.value = value;
		}

		public String toString(){
			return value;
		}

		public static OperatorType getByValue(String value){
			OperatorType returnValue = null;
			for (final OperatorType element : EnumSet.allOf(OperatorType.class)) {
				if (element.toString().equals(value)) {
					returnValue = element;
				}
			}
			return returnValue;
		}
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private JShopParamType type;
	
	private String value;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="param")
	private List<JShopParam> params = new ArrayList<JShopParam>();
	
	@ManyToOne(optional=true)
	private LDTask task;
	
	@ManyToOne(optional=true)
	private JShopParam param;
	
	public JShopParam() { }
	
	public JShopParam(JShopParamType type) {
		this(type, null);
	}
	
	public JShopParam(JShopParamType type, String value) {
		this.type = type;
		this.value = value;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setType(JShopParamType type) {
		this.type = type;
	}

	public JShopParamType getType() {
		return type;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public JShopParam setParams(List<JShopParam> params) {
		List<JShopParam> clone = new ArrayList<JShopParam>(this.params);
		for (JShopParam param: clone) {
			this.removeParam(param);
		}
		for (JShopParam param: params) {
			this.addParam(param);
		}
		this.params = params;
		return this;
	}
	
	public JShopParam addParam(JShopParam param){
		this.params.add(param);
		param.setParam(this);
		return this;
	}
	
	public JShopParam removeParam(JShopParam param) {
		this.params.remove(param);
		param.setParam(null);
		return this;
	}

	public List<JShopParam> getParams() {
		return params;
	}

	public void setTask(LDTask task) {
		this.task = task;
	}

	public LDTask getTask() {
		return task;
	}

	public void setParam(JShopParam param) {
		this.param = param;
	}

	public JShopParam getParam() {
		return param;
	}

}
