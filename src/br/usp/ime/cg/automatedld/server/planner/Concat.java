package br.usp.ime.cg.automatedld.server.planner;
import java.util.ArrayList;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermList;

public class Concat implements Calculate {
    
    public TermList concat(java.util.List<TermList> lists) {
        TermList toReturn = TermList.NIL;
        for (TermList termList : lists) {
            List list = termList.getList();
            while(list != null) {
                Term element = list.getHead();
                toReturn = new TermList(element, toReturn);
                list = list.getRest();
            }
        }
        return toReturn;
    }
    
    public Term call(List list) {
        java.util.List<TermList> termList = new ArrayList<TermList>();
        while (list != null) {
            termList.add((TermList) list.getHead());
            list = list.getRest();
        }
        return concat(termList);
    }

}
