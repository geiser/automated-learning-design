package br.usp.ime.cg.automatedld.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.DataField;
import com.extjs.gxt.ui.client.data.HttpProxy;
import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelType;
import com.extjs.gxt.ui.client.data.XmlLoadResultReader;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;

public class MetadataListView extends LayoutContainer {

	private final String type;
	private final String basePath;

	private final BaseListLoader<ListLoadResult<ModelData>> loader;
	private final Map<String, String> fields = new HashMap<String, String>();

	public MetadataListView() {
		this(null, null);
	}

	public MetadataListView(String type, String[] fields) {
		this(type, fields, fields, GWT.getHostPageBaseURL());
	}

	public MetadataListView(String type, String[] fields, String[] titles) {
		this(type, fields, titles, GWT.getHostPageBaseURL());
	}

	public MetadataListView(String type, String[] fields, String[] titles, String basePath) {
		this.type = type;
		this.basePath = basePath;
		for (int i = 0; i < fields.length; i++) {
			this.fields.put(fields[i], titles[i]);
		}

		DataField id = new DataField("id");
		id.setType(Long.class);

		ModelType typeModel = new ModelType();
		typeModel.setRoot("list");
		typeModel.setRecordName("metadata");
		typeModel.addField(id);
		for (String field : fields) {
			typeModel.addField(this.fields.get(field), field);
		}

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, basePath + "metadatas/" + type + "s?_format=xml");
		HttpProxy<String> proxy = new HttpProxy<String>(builder);
		XmlLoadResultReader<ListLoadResult<ModelData>> reader = new XmlLoadResultReader<ListLoadResult<ModelData>>(typeModel);
		this.loader = new BaseListLoader<ListLoadResult<ModelData>>(proxy, reader);

		this.loader.load();
	}

	@Override  
	protected void onRender(Element parent, int index) {  
		super.onRender(parent, index);
		setLayout(new FlowLayout(10));

		ListStore<ModelData> store = new ListStore<ModelData>(loader);

		List<ColumnConfig> columns = new ArrayList<ColumnConfig>();
		for (String field : this.fields.keySet()) {
			columns.add(new ColumnConfig(this.fields.get(field), this.fields.get(field), 100));
		}
		ColumnConfig column = new ColumnConfig();
		column.setId("Options");
		column.setHeader("Options");
		column.setWidth(100);
		column.setAlignment(HorizontalAlignment.CENTER);
		column.setRenderer(new GridCellRenderer<ModelData>(){

			@Override
			public Object render(final ModelData model, String property,
					ColumnData config, int rowIndex, int colIndex,
					ListStore<ModelData> store, Grid<ModelData> grid) {
				Button editButton = new Button("Edit", new SelectionListener<ButtonEvent>() {  
					@Override
					public void componentSelected(ButtonEvent ce) {
						String itemURL = MetadataListView.this.basePath + "metadatas/" + MetadataListView.this.type + "s/" + model.get("id").toString();
						Window.open(itemURL, "_self", null);  
					}
				});  
				editButton.setToolTip("Click for edit this record");

				Button deleteButton = new Button("Delete",  new SelectionListener<ButtonEvent>(){
					@Override
					public void componentSelected(ButtonEvent ce) {
						MessageBox.confirm("Confirm", "Are you sure you want to delete that?", new Listener<MessageBoxEvent>() {
							@Override
							public void handleEvent(MessageBoxEvent be) {
								String buttonString = be.getButtonClicked().getText();
								if (!be.isCancelled() && (!"No".equals(buttonString))) {
									HttpProxyRequestBuilder rb = new HttpProxyRequestBuilder(RequestBuilder.DELETE, 
											MetadataListView.this.basePath + "metadatas/" + MetadataListView.this.type + "s/" + model.get("id").toString());
									rb.sendRequest(null, new RequestCallback() {
										@Override
										public void onResponseReceived(Request request, Response response) {
											MetadataListView.this.loader.load();
										}
										@Override
										public void onError(Request request, Throwable e) {
											Window.alert("ERROR: " + e.getMessage() + " in request " + request.toString());
										}
									});
								}
							}
						});
					}
				});
				deleteButton.setToolTip("Click for delete this record");

				HorizontalPanel panel = new HorizontalPanel();
				panel.setWidth("100%");
				panel.setHorizontalAlign(HorizontalAlignment.CENTER);
				panel.add(editButton);
				panel.add(deleteButton);
				return panel;
			}});
		columns.add(column);
		ColumnModel cm = new ColumnModel(columns);

		final Grid<ModelData> grid = new Grid<ModelData>(store, cm);
		grid.setBorders(true); 
		grid.setLoadMask(true);
		grid.setAutoExpandColumn(columns.get(0).getId());

		ContentPanel panel = new ContentPanel();
		panel.setFrame(true);
		panel.setCollapsible(false);  
		panel.setAnimCollapse(false);
		panel.setButtonAlign(HorizontalAlignment.CENTER);
		panel.setHeading("Table of " + type);
		panel.setLayout(new FitLayout());
		panel.add(grid);
		panel.setSize(650, 400);

		add(panel);
	}  

}
