package br.usp.ime.cg.automatedld.server.planner;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermList;
import com.gamalocus.jshop2rt.TermNumber;

public class GetLength implements Calculate {
    public Term call(List args) {
        if (((TermList) args.getHead()).getList() == null) return new TermNumber(0.0); 
        double value = ((TermList) args.getHead()).getList().size() + 0.0;
        return new TermNumber(value);
    }
}