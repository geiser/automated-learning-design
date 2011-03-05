package br.usp.ime.cg.automatedld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

public class Application implements EntryPoint {

	private native void exportAPI() /*-{
	 	$wnd.addMetadataListView = @br.usp.ime.cg.automatedld.client.Application::addMetadataListView(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;);
	 	
//	 	$wnd.addRelationPathView = @br.usp.ime.cg.automatedld.client.Application::addRelationPathView(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;);
//	 	$wnd.addListPathView = @br.usp.ime.cg.automatedld.client.Application::addListPathView(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;);
	 	$wnd.addPlannerView = @br.usp.ime.cg.automatedld.client.Application::addPlannerView(Ljava/lang/String;Ljava/lang/String;);
	 }-*/;

	private native void executeExternalInjections() /*-{
	 	$wnd.executeInjections();
	 }-*/;

	public void onModuleLoad() {
		exportAPI();
		executeExternalInjections();
	}
	
//	public static void addRelationView(String containerId, String className, String objectFromId, String typeId) {
//		RootPanel.get(containerId).add(new RelationView(className, objectFromId, typeId));
//	}
//	
//	public static void addRelationPathView(String containerId, String className, String objectFromId, String typeId, String path) {
//		RootPanel.get(containerId).add(new RelationView(className, objectFromId, typeId, path));
//	}
	
	public static void addMetadataListView(String containerId, String type, String[] fields, String[] titles, String path) {
		if (titles==null) titles = fields;
		if (path==null) path = GWT.getHostPageBaseURL();
		MetadataListView metadataListView = new MetadataListView(type, fields, titles, path);
		RootPanel.get(containerId).add(metadataListView);
	}

//	public static void addListPathView(String containerId, String className, String[] fields, String path) {
//		ListView listView = new ListView(className, fields, path);
//		if ("basicType".equals(className)) { listView.setHasRelation(false); }
//		RootPanel.get(containerId).add(listView);
//	}
	
	public static void addPlannerView(String containerId, String path) {
		if (path==null) path = GWT.getHostPageBaseURL();
		RootPanel.get(containerId).add(new PlannerView(path));
	}
	
}
