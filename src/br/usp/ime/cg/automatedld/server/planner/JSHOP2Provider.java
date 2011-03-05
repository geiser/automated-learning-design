package br.usp.ime.cg.automatedld.server.planner;

import com.gamalocus.jshop2rt.JSHOP2;

public class JSHOP2Provider {

	private static JSHOP2 jShop2;
	private static String basePath;
	
	private JSHOP2Provider() { }

	public static void setJSHOP2(JSHOP2 jShop2Planner) {
		jShop2 = jShop2Planner;
	}

	public static JSHOP2 getJSHOP2() {
		if (jShop2 == null) {
			throw new Error("Error jShop2 doesnt initialize!!");
		}
		return jShop2;
	}

	public static String getBasePath() {
		if (basePath == null) {
			basePath = "http://localhost:8088/automated-learning-design";
		} 
		return basePath;
	}
	
	public static void setBasePath(String pBasePath) {
		basePath = pBasePath;
	}
	
}
