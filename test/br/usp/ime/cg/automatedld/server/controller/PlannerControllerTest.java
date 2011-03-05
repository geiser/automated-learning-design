package br.usp.ime.cg.automatedld.server.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.MockResult;

import com.gamalocus.jshop2rt.Plan;

public class PlannerControllerTest {

	private MockResult result;
	private PlannerController controller;

	@Before
	public void setUp() throws Exception {
		result = new MockResult();
		controller = new PlannerController(result, null, null, null);
	}

	@Test
	public void testSizeOfPlanInTestIMSLDPlanner() {
		//controller.test();
		Plan plan = (Plan) result.included("plan");
		
		assertEquals(54, plan.getOps().size());
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
