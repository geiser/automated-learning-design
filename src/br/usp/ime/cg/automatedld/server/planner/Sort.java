package br.usp.ime.cg.automatedld.server.planner;

import java.util.ArrayList;

import br.usp.ime.cg.automatedld.server.util.Graph;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.State;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermConstant;
import com.gamalocus.jshop2rt.TermList;

public class Sort implements Calculate {
	
	/**
	 * (call Sort ?unsortConcepts isRequieredBy)
	 */
	public Term call(List l) {
		Domain domain = JSHOP2Provider.getJSHOP2().getDomain();
		State state = JSHOP2Provider.getJSHOP2().getState();
		
		List unsorted = ((TermList) l.getHead()).getList();
		TermConstant relation = (TermConstant) l.getRest().getHead();
		
		java.util.List<Term> relationArgs = new ArrayList<Term>(state.getArguments(domain.addConstant("relation")));
		
		Graph<String, String> graph = new Graph<String, String>();
		while (unsorted != null) {
			TermConstant headFrom = (TermConstant) unsorted.getHead();
			graph.addNode(headFrom.getName());
			
			List unsortedTo = unsorted.getRest();
			while (unsortedTo != null){
				TermConstant headTo = (TermConstant) unsortedTo.getHead();
				TermList relationTerm = new TermList(headFrom, new TermList(relation, new TermList(headTo, TermList.NIL)));
				if (relationArgs.contains(relationTerm)) {
					graph.addEdge(headFrom.getName(), relation.getName(), headTo.getName());					
				}
				TermList invRelationTerm = new TermList(headTo, new TermList(relation, new TermList(headFrom, TermList.NIL)));
				if (relationArgs.contains(invRelationTerm)){
					graph.addEdge(headTo.getName(), relation.getName(), headFrom.getName());
				}
				unsortedTo = unsortedTo.getRest();
			}
			unsorted = unsorted.getRest();
		}
		
		TermList toReturn = TermList.NIL;
		java.util.List<String> sorted = graph.topologicalSort(relation.getName());
		for (int i=1; i<=sorted.size() ; i++) {
			String name = sorted.get(sorted.size() - i);
			TermConstant head =  domain.getTermConstant(domain.addConstant(name));
			toReturn = new TermList(head, toReturn);
		}
		
		return toReturn;
	}

}
