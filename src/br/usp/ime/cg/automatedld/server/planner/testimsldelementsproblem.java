package br.usp.ime.cg.automatedld.server.planner;
import java.util.LinkedList;
import com.gamalocus.jshop2rt.*;

public class testimsldelementsproblem
{
	public static final String sourcePath = "/home/geiser/workspace/automated-learning-design/resource/br/usp/ime/cg/automatedld/server/planner/testimsldelementsproblem";
	public static final long sourceLastModified = 1287194648000L;

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();

		Domain d = new testimsldelements();

		State s = new State(d.getAxioms());


			TaskList tl = new TaskList(1, true);
			tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 0, TermList.NIL), false, false));
			JSHOP2 jShop2Planner = new JSHOP2(tl, 10000, new DoubleCost(0.0), d, s);
			while (jShop2Planner.run()){ 
			}

		returnedPlans = jShop2Planner.getPlans();

		System.out.println(jShop2Planner.getPlans().getFirst().toString(d));
		return returnedPlans;
	}

	public static Plan getFirstPlanOps() {
		return getPlans().getFirst();
	}
}