package br.usp.ime.cg.automatedld.server.util;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.Plan;
import com.gamalocus.jshop2rt.State;
import com.gamalocus.jshop2rt.TermList;

import br.usp.ime.cg.automatedld.server.model.JShopParam;
import br.usp.ime.cg.automatedld.server.model.JShopParam.JShopParamType;
import br.usp.ime.cg.automatedld.server.model.LDPlan;
import br.usp.ime.cg.automatedld.server.model.Metadata;
import br.usp.ime.cg.automatedld.server.model.Property;
import br.usp.ime.cg.automatedld.server.model.Relation;
import br.usp.ime.cg.automatedld.server.planner.testimsldelements;
import br.usp.ime.cg.automatedld.server.planner.testimsldelementsproblem;

public class LDPlanFactoryTest {

	private Domain domain;

	@Before
	public void setUp() throws Exception {
		this.domain = new testimsldelements();
	}

	@Test
	public void testMakeLDPlanOftestimldelementsproblem() {
		Plan plan = testimsldelementsproblem.getFirstPlanOps();
		
		LDPlan ldPlan = LDPlanFactory.makePlan(plan, domain);
		
		assertNotNull(ldPlan);
	}
	
	@Test
	public void testGetParamsFromTermList() {
		// sample: (param1 param2 (param31 (param321 param322) param33) param4)
		TermList sample = new TermList(domain.getTermConstant(domain.addConstant("param1")),
				new TermList(domain.getTermConstant(domain.addConstant("param2")),
				new TermList(
						new TermList(domain.getTermConstant(domain.addConstant("param31")),
						new TermList(
								new TermList(domain.getTermConstant(domain.addConstant("param321")),
								new TermList(domain.getTermConstant(domain.addConstant("param322"))
									, TermList.NIL)),
						new TermList(domain.getTermConstant(domain.addConstant("param33")),
								TermList.NIL))),
				new TermList(domain.getTermConstant(domain.addConstant("param4")),
				TermList.NIL))));
		sample.print();
		
		List<JShopParam> result = LDPlanFactory.getParamsFromTermList(sample.getList());
		
		assertEquals(4, result.size());
		assertEquals("param1", result.get(0).getValue());
		assertEquals(JShopParamType.TERMCONSTANT, result.get(0).getType());
		
		assertEquals("param2", result.get(1).getValue());
		assertEquals(JShopParamType.TERMCONSTANT, result.get(1).getType());
		
			assertEquals(3, result.get(2).getParams().size());
		
			assertEquals("param31", result.get(2).getParams().get(0).getValue());
			assertEquals(JShopParamType.TERMCONSTANT, result.get(2).getParams().get(0).getType());
			
				assertEquals(2, result.get(2).getParams().get(1).getParams().size());
				
				assertEquals("param321", result.get(2).getParams().get(1).getParams().get(0).getValue());
				assertEquals(JShopParamType.TERMCONSTANT, result.get(2).getParams().get(1).getParams().get(0).getType());
				
				assertEquals("param322", result.get(2).getParams().get(1).getParams().get(1).getValue());
				assertEquals(JShopParamType.TERMCONSTANT, result.get(2).getParams().get(1).getParams().get(1).getType());
		
			assertEquals("param33", result.get(2).getParams().get(2).getValue());
			assertEquals(JShopParamType.TERMCONSTANT, result.get(2).getParams().get(2).getType());
			
		assertEquals("param4", result.get(3).getValue());
		assertEquals(JShopParamType.TERMCONSTANT, result.get(3).getType());
		
	}
	
	
	
	@Test
	public void testMakeInitialState() {
		State state = new State(domain.getAxioms());
		
		Metadata competence01 = new Metadata("competence", "http://dev.ime.usp.br/competences/1")
		.addProperty(new Property("skill",
				new Metadata("skill", "http://dev.ime.usp.br/skill/1")
				.addProperty(new Property("title","Argue"))))
		.addProperty(new Property("knowledge",
				new Metadata("knowledge", "http://dev.ime.usp.br/knowledge/1")
				.addProperty(new Property("title","Derivates"))));
		
		LDPlanFactory.addMetadataToState(competence01, state, domain);
		state.print(domain);
		
		Metadata competence02 = new Metadata("competence", "http://dev.ime.usp.br/competences/2")
		.addProperty(new Property("skill",
				new Metadata("skill", "http://dev.ime.usp.br/skill/1")
				.addProperty(new Property("title","Argue"))))
		.addProperty(new Property("knowledge",
				new Metadata("knowledge", "http://dev.ime.usp.br/knowledge/2")
				.addProperty(new Property("title","Limits"))))
		.addRelation(new Relation("isRequieredBy", competence01));
		
		LDPlanFactory.addMetadataToState(competence02, state, domain);
		state.print(domain);
		
		Metadata metadata = new Metadata("concept", "http://dev.ime.usp.br/concept/1")
		.addProperty(new Property("hasObjective", competence01, "0;3"))
		.addProperty(new Property("hasObjective", competence02, "2;1"));
		
		LDPlanFactory.addMetadataToState(metadata, state, domain);
		state.print(domain);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
