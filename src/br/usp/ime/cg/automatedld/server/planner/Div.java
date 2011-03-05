package br.usp.ime.cg.automatedld.server.planner;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermNumber;

public class Div implements Calculate {

    public Term call(List list) {
        TermNumber dividendo = (TermNumber) list.getHead();
        TermNumber divisor = (TermNumber) list.getRest().getHead();
        
        double toReturn = dividendo.getNumber() / divisor.getNumber();
        toReturn = Double.valueOf(toReturn).intValue();
        
        return new TermNumber(toReturn);
    }

}
