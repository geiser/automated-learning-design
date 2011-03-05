package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resource implements Serializable {
	
	private static final long serialVersionUID = 5011239008727436521L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	private String body;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

}
