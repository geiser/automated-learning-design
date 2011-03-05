package br.usp.ime.cg.automatedld.server.planner;

import java.util.Iterator;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.State;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermConstant;
import com.gamalocus.jshop2rt.TermList;

public class GetMetadata implements Calculate {

	@Override
	public Term call(List l) {
		
		Domain domain = JSHOP2Provider.getJSHOP2().getDomain();
		State state = JSHOP2Provider.getJSHOP2().getState();
		
		TermConstant property = (TermConstant) l.getHead();
		TermConstant id = (TermConstant) l.getRest().getHead();
		
		Iterator<Term> it = state.getArguments(domain.addConstant("property")).iterator();
		
		TermConstant toReturn = null;
		while ((toReturn == null) && (it.hasNext())) {
			List list = ((TermList) it.next()).getList();
			if ((list != null && list.getHead() != null && list.getHead().equals(id)) &&
				(list.getRest() != null && list.getRest().getHead() != null && list.getRest().getHead().equals(property))) {
				toReturn = (TermConstant) list.getRest().getRest().getHead();
			}
		}
		if (toReturn == null){
			l.print();
			throw new Error("The property " +  property.getName() + " of metadata " + id.getName() + " doesnt exist in the current state of world!!");
		}
		
		return toReturn;
	}

}
