package br.usp.ime.cg.automatedld.server.planner;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermList;
import com.gamalocus.jshop2rt.TermNumber;

public class Split implements Calculate {

    public Term call(List args) {
        TermList termList = (TermList) args.getHead();
        TermNumber maxLenght = (TermNumber) args.getRest().getHead();
        TermNumber n = (TermNumber) args.getRest().getRest().getHead();
        return split(termList.getList(), maxLenght, n);
    }

    private Term split(List list, TermNumber maxLenght, TermNumber n) {
        TermList toReturn = TermList.NIL;
        for (double i = 0.0; i < n.getNumber(); i++) {
            TermList add = TermList.NIL;
            for (double j = 0.0; j < maxLenght.getNumber(); j++) {
                Term head = list.getHead();
                add = new TermList(head, add);
                list = list.getRest();
            }
            toReturn = new TermList(new TermList(add.getList()), toReturn);             
        }
        // while (list != null){}
        return toReturn;
    }

    public TermList concat(TermList... lists) {
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

}
