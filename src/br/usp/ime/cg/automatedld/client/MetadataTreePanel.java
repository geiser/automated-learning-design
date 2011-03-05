package br.usp.ime.cg.automatedld.client;

import java.util.List;

import com.extjs.gxt.ui.client.data.BaseTreeLoader;
import com.extjs.gxt.ui.client.data.DataField;
import com.extjs.gxt.ui.client.data.HttpProxy;
import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelType;
import com.extjs.gxt.ui.client.data.TreeLoader;
import com.extjs.gxt.ui.client.data.XmlReader;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanelSelectionModel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.SimplePanel;

public class MetadataTreePanel extends LayoutContainer {
	
	private final String basePath;
	private final TreePanelSelectionModel<ModelData> sm;
	private final SimplePanel container; 
	
	public MetadataTreePanel(SimplePanel container) {
		this(container, GWT.getHostPageBaseURL(), new TreePanelSelectionModel<ModelData>());
	}
	
	public MetadataTreePanel(SimplePanel container, String basePath, TreePanelSelectionModel<ModelData> sm) {
		this.container = container;
		this.basePath = basePath;
		this.sm = sm;
	}

	@Override
	protected void onRender(Element parent, int index) {
		super.onRender(parent, index);

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, basePath + "metadatas?_format=xml");
		HttpProxy<ListLoadResult<ModelData>> proxy = new HttpProxy<ListLoadResult<ModelData>>(builder);

		ModelType type = new ModelType();
		type.setRoot("list");
		type.setRecordName("metadata");
		type.addField("id", "identifier");
		type.addField("name", "@name");
		type.addField("type", "type");
		DataField key = new DataField("key", "id");
		key.setType(Long.class);
		type.addField(key);

		XmlReader<List<ModelData>> reader = new XmlReader<List<ModelData>>(type);

		TreeLoader<ModelData> loader = new BaseTreeLoader<ModelData>(proxy, reader) {
			@Override
			public boolean hasChildren(ModelData parent) {
				return "folder".equals(parent.get("type"));
			}

			@Override
			protected Object prepareLoadConfig(Object config) {
				// by default the load config will be the parent model
				// http proxy will set all properties of model into request
				// parameters, so the model name and id will be passed to server
				return super.prepareLoadConfig(config);
			}
		};

		TreeStore<ModelData> store = new TreeStore<ModelData>(loader);

		final TreePanel<ModelData> tree = new TreePanel<ModelData>(store);
		tree.setDisplayProperty("name");
		tree.setWidth("300px");
		tree.setSelectionModel(sm);
		tree.addListener(Events.OnClick, new Listener<BaseEvent>() {

			@Override
			public void handleEvent(BaseEvent be) {
				ModelData item = sm.getSelectedItem();
				String src = MetadataTreePanel.this.basePath + "metadatas/";
				if ("folder".equals(item.get("type").toString())) {
					src += item.get("id") + "s";
				} else {
					src += item.get("type") + "s" + "/" + item.get("key").toString();
				}
				Frame frame = new Frame(src);
				frame.setWidth("100%");
				frame.setHeight("480px");
				container.setWidget(frame);
			}
			
		});
		
		loader.load();
		
		this.add(tree);
	}

}
