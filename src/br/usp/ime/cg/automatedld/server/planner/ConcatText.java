package br.usp.ime.cg.automatedld.server.planner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import com.gamalocus.jshop2rt.Calculate;
import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermConstant;
import com.gamalocus.jshop2rt.TermList;

public class ConcatText implements Calculate {
	
	@Override
	public Term call(List l) {
		Domain domain = JSHOP2Provider.getJSHOP2().getDomain();
		
		String basePath = JSHOP2Provider.getBasePath();
		
		String text = "";
		while (l != null) {
			if (l.getHead() instanceof TermList) { 
				text += ((TermConstant) this.call(((TermList) l.getHead()).getList())).getName();
			} else {
				try {
					text += URLEncoder.encode(((TermConstant) l.getHead()).getName(), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			l = l.getRest();
		}
		
		
		if (text.startsWith("__basePath")) {
			text = text.replaceAll("__basePath", basePath)
			.replaceAll("_____", "=")
			.replaceAll("____", "&")
			.replaceAll("___", "?")
			.replaceAll("__", "/");
		}
		
		return domain.getTermConstant(domain.addConstant(text));
	}

}
