package br.usp.ime.cg.automatedld.server.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.db.dao.MetadataDAO;
import br.usp.ime.cg.automatedld.server.model.Metadata;

@Resource
@RequestScoped
public class InfoController {

	private final Result result;
	private final MetadataDAO dao;

	public InfoController(Result result, MetadataDAO dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Get
	@Path(value="/resources/info/activity/{theoryName}")
	public void activity(String theoryName, String instructors, String learners, String skillId, String knowledgeId) throws UnsupportedEncodingException {
		
		if (instructors != null && !"".equals(instructors)) {
			List<String> instructorIds = Arrays.asList(instructors.split(";"));
			result.include("instructorIds", instructorIds);
		}
		
		if (learners != null && !"".equals(learners)) {
			List<String> learnerIds = Arrays.asList(learners.split(";"));
			result.include("learnerIds", learnerIds);
		}
		
		if (skillId != null && !"".equals(skillId)) {
			Metadata skill = dao.buildQuery().find("skill", skillId);
			result.include("skill", skill);
		}
	
		if (knowledgeId != null && !"".equals(knowledgeId)) {
			Metadata knowledge = dao.buildQuery().find("knowledge", knowledgeId);
			result.include("knowledge", knowledge);
		}
		
		result.include("theoryName", theoryName);
	}
	
}
