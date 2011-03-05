package br.usp.ime.cg.automatedld.server.planner;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;

public class GetNewRole implements Calculate {

    private Domain domain;
    private static int numGroups = 0;

    public Term call(List args) {
    	this.domain = JSHOP2Provider.getJSHOP2().getDomain();
        numGroups++;
        return domain.getTermConstant(domain.addConstant("role-"+numGroups));
    }

}
