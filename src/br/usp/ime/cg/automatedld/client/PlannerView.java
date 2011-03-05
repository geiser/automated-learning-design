package br.usp.ime.cg.automatedld.client;

import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.Style.VerticalAlignment;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.DataField;
import com.extjs.gxt.ui.client.data.HttpProxy;
import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelType;
import com.extjs.gxt.ui.client.data.XmlLoadResultReader;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.grid.CheckBoxSelectionModel;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanelSelectionModel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PlannerView extends LayoutContainer {

	private BaseListLoader<ListLoadResult<ModelData>> conceptLoader;
	private ListStore<ModelData> conceptStore;

	private BaseListLoader<ListLoadResult<ModelData>> learnerLoader;
	private ListStore<ModelData> learnerStore;
	private String basePath;
	
	public PlannerView() {
		this(GWT.getHostPageBaseURL());
	}

	public PlannerView(String basePath) {
		super();

		this.basePath = basePath;

		DataField id = new DataField("id");
		id.setType(Long.class);

		// load concept metadata
		ModelType conceptType = new ModelType();
		conceptType.setRoot("list");
		conceptType.setRecordName("metadata");
		conceptType.addField(id);

		conceptType.addField("URL", "identifier");
		conceptType.addField("Title", "properties/property[@name='title']/value");

		RequestBuilder conceptBuilder = new RequestBuilder(RequestBuilder.GET, basePath + "metadatas/concepts?_format=xml");
		HttpProxy<String> conceptProxy = new HttpProxy<String>(conceptBuilder);
		XmlLoadResultReader<ListLoadResult<ModelData>> conceptReader = new XmlLoadResultReader<ListLoadResult<ModelData>>(conceptType);

		this.conceptLoader = new BaseListLoader<ListLoadResult<ModelData>>(conceptProxy, conceptReader);
		this.conceptStore = new ListStore<ModelData>(conceptLoader);

		this.conceptLoader.load();

		// load learner metadata
		ModelType learnerType = new ModelType();
		learnerType.setRoot("list");
		learnerType.setRecordName("metadata");
		learnerType.addField(id);
		learnerType.addField("Email", "identifier");
		learnerType.addField("Level", "properties/property[@name='hasEducationalLevel']/value");

		RequestBuilder learnerBuilder = new RequestBuilder(RequestBuilder.GET, basePath + "metadatas/learners?_format=xml");
		HttpProxy<String> learnerProxy = new HttpProxy<String>(learnerBuilder);
		XmlLoadResultReader<ListLoadResult<ModelData>> learnerReader = new XmlLoadResultReader<ListLoadResult<ModelData>>(learnerType);

		this.learnerLoader = new BaseListLoader<ListLoadResult<ModelData>>(learnerProxy, learnerReader);
		this.learnerStore = new ListStore<ModelData>(learnerLoader);

		this.learnerLoader.load();
	}


	@Override  
	protected void onRender(Element parent, int index) {
		super.onRender(parent, index);
		setStyleAttribute("margin", "10px");

		final TextBox nameTextBox = new TextBox();
		nameTextBox.setValue("Insert name of IMS-LD");

		final HorizontalPanel topPanel = new HorizontalPanel();
		topPanel.setWidth("100%");
		topPanel.setVerticalAlign(VerticalAlignment.MIDDLE);
		topPanel.setHorizontalAlign(HorizontalAlignment.CENTER);
		topPanel.add(new Label("Name of IMS-LD: "));
		topPanel.add(nameTextBox);
		topPanel.add(new Label(" | Add: "));
		String conceptURL = basePath + "metadatas/concepts/add";
		topPanel.add(new Anchor("Concept", false, conceptURL, "_blank"));
		topPanel.add(new Label(" - "));
		String learnerURL = basePath + "metadatas/learners/add";
		topPanel.add(new Anchor("Learner", false, learnerURL, "_blank"));

		// Grid for concepts
		final CheckBoxSelectionModel<ModelData> conceptSelectionModel = new CheckBoxSelectionModel<ModelData>();
		List<ColumnConfig> conceptConfigColumns = new ArrayList<ColumnConfig>();
		conceptConfigColumns.add(conceptSelectionModel.getColumn());
		conceptConfigColumns.add(new ColumnConfig("URL", "URL", 150));
		conceptConfigColumns.add(new ColumnConfig("Title", "Title", 100));
		ColumnConfig conceptOptionConfigColumn = new ColumnConfig("Opt", "Opt", 50);
		conceptOptionConfigColumn.setAlignment(HorizontalAlignment.CENTER);
		conceptOptionConfigColumn.setRenderer(new GridCellRenderer<ModelData>() {
			public Object render(final ModelData model, String property,
					ColumnData config, int rowIndex, int colIndex,
					ListStore<ModelData> store, Grid<ModelData> grid) {
				String itemURL = basePath + "metadatas/concepts/" + model.get("id").toString();
				return new Anchor("Edit", false, itemURL, "_blank");
			}
		});
		conceptConfigColumns.add(conceptOptionConfigColumn);
		ColumnModel conceptColumnModel = new ColumnModel(conceptConfigColumns);

		final Grid<ModelData> conceptGrid = new EditorGrid<ModelData>(conceptStore, conceptColumnModel);
		conceptGrid.setSelectionModel(conceptSelectionModel);
		conceptGrid.addPlugin(conceptSelectionModel);
		conceptGrid.setBorders(true);
		conceptGrid.setAutoExpandColumn(conceptConfigColumns.get(2).getId());

		// Grid for learners
		final CheckBoxSelectionModel<ModelData> learnerSelectionModel = new CheckBoxSelectionModel<ModelData>();
		List<ColumnConfig> learnerConfigColumns = new ArrayList<ColumnConfig>();
		learnerConfigColumns.add(learnerSelectionModel.getColumn());
		learnerConfigColumns.add(new ColumnConfig("Email", "Email", 100));
		learnerConfigColumns.add(new ColumnConfig("Level", "Level", 100));
		ColumnConfig learnerOptionConfigColumn = new ColumnConfig("Opt", "Opt", 50);
		learnerOptionConfigColumn.setAlignment(HorizontalAlignment.CENTER);
		learnerOptionConfigColumn.setRenderer(new GridCellRenderer<ModelData>() {
			public Object render(final ModelData model, String property,
					ColumnData config, int rowIndex, int colIndex,
					ListStore<ModelData> store, Grid<ModelData> grid) {
				String itemURL = basePath + "metadatas/learners/" + model.get("id").toString();
				return new Anchor("Edit", false, itemURL, "_blank");
			}
		});
		learnerConfigColumns.add(learnerOptionConfigColumn);
		ColumnModel learnerColumnModel = new ColumnModel(learnerConfigColumns);

		final Grid<ModelData> learnerGrid = new Grid<ModelData>(learnerStore, learnerColumnModel);
		learnerGrid.setSelectionModel(learnerSelectionModel);
		learnerGrid.addPlugin(learnerSelectionModel);
		learnerGrid.setBorders(true);
		learnerGrid.setAutoExpandColumn(learnerConfigColumns.get(1).getId());

		// Panel for concepts
		final ContentPanel conceptPanel = new ContentPanel();
		conceptPanel.setWidth("100%");
		conceptPanel.setHeight(140);
		conceptPanel.setFrame(true);
		conceptPanel.setCollapsible(false);
		conceptPanel.setAnimCollapse(false);
		conceptPanel.setHeading("Select -> Concepts");
		conceptPanel.setLayout(new FitLayout());
		conceptPanel.add(conceptGrid);

		// Panel for learners 
		final ContentPanel learnerPanel = new ContentPanel();
		learnerPanel.setWidth("100%");
		learnerPanel.setHeight(295);
		learnerPanel.setFrame(true);
		learnerPanel.setCollapsible(false);  
		learnerPanel.setAnimCollapse(false);
		learnerPanel.setButtonAlign(HorizontalAlignment.CENTER);
		learnerPanel.setHeading("Select -> Learners");
		learnerPanel.setLayout(new FitLayout());
		learnerPanel.add(learnerGrid);

		learnerPanel.addButton(new Button("reload", new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				PlannerView.this.conceptLoader.load();
				PlannerView.this.learnerLoader.load();
			}
		}));

		learnerPanel.addButton(new Button("do plan", new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				boolean isLearnerSelect = false;
				boolean isConceptSelect = false;

				HttpProxyRequestBuilder rb = new HttpProxyRequestBuilder(RequestBuilder.POST, basePath + "planner");
				rb.setParam("name", nameTextBox.getValue());

				List<ModelData> conceptItems = conceptSelectionModel.getSelectedItems();
				for (ModelData item : conceptItems) {
					isConceptSelect = true;
					Long id = (Long) item.get("id");
					rb.setParam("concepts[" + id + "].id", id);
					rb.setParam("concepts[" + id + "].type", "concept");
					rb.setParam("concepts[" + id + "].identifier", item.get("URL"));					
				}

				List<ModelData> learnerItems = learnerSelectionModel.getSelectedItems();
				for (ModelData item : learnerItems) {
					isLearnerSelect = true;
					Long id = (Long) item.get("id");
					rb.setParam("learners[" + id + "].id", id);
					rb.setParam("learners[" + id + "].type", "learner");
					rb.setParam("learners[" + id + "].identifier", item.get("Email"));
				}

				// we can send
				if (isConceptSelect && isLearnerSelect) {
					rb.sendRequest(null, new RequestCallback() {
						@Override
						public void onResponseReceived(Request request, Response response) {
							Window.alert("The new IMS-LD plan was generated .. Show result in a link (show results)");
						}

						@Override
						public void onError(Request request, Throwable exception) {
							Window.alert("ERROR -> Try again!!!");
						}
					});
				} else {
					Window.alert("Cant send requisition, you must select one concept and one learner");
				}
			}
		}));

		/////////////////////////////////////////////////////////////////////////////////

		final LayoutContainer container = new LayoutContainer();
		container.setStyleAttribute("margin", "2px");
		container.setSize(900, 500);
		container.setBorders(true);
		container.setLayout(new BorderLayout());

		final ContentPanel menuPanel = new ContentPanel();  
		menuPanel.setHeading("Menu");

		final ContentPanel principalPanel = new ContentPanel();  
		principalPanel.setHeading("Planner");  
		principalPanel.setScrollMode(Scroll.NONE);

		final SimplePanel contentPanel = new SimplePanel();
		principalPanel.add(contentPanel);

		final TreeStore<ModelData> treeStore = new TreeStore<ModelData>();  		   
		final TreePanel<ModelData> tree = new TreePanel<ModelData>(treeStore);
		tree.setDisplayProperty("name");
		final TreePanelSelectionModel<ModelData> sm = new TreePanelSelectionModel<ModelData>();
		tree.setSelectionModel(sm);
		
		final SimplePanel treePanel = new SimplePanel();
		treePanel.setWidth("100%");
		treePanel.setHeight("300px");
		
		// TODO change Events.OnClick for Events.SelectionChange
		tree.addListener(Events.OnClick, new Listener<BaseEvent>() {
			public void handleEvent(BaseEvent be) {
				ModelData item = sm.getSelectedItem();
				if ("frame".equals(item.get("type").toString())) {
					Frame frame = new Frame(item.get("src").toString());
					frame.setWidth("100%");
					frame.setHeight(container.getHeight()-20+"px");
					contentPanel.setWidget(frame);
				} else if ("main".equals(item.get("type").toString())) {
					VerticalPanel vPanel = new VerticalPanel();
					vPanel.setWidth("100%");
					vPanel.setHeight("100%");
					vPanel.add(topPanel);
					vPanel.add(conceptPanel);
					vPanel.add(learnerPanel);
					contentPanel.setWidget(vPanel);
				}
			}
		});

		ToolBar toolBar = new ToolBar();  
		Button learningDesignsButton = new Button("LDs");    
		learningDesignsButton.addSelectionListener(new SelectionListener<ButtonEvent>() {  
			public void componentSelected(ButtonEvent ce) {
				principalPanel.setHeading("Learning Design");
				
				BaseTreeModel plannerItem = new BaseTreeModel();
				plannerItem.set("name", "Planner");
				plannerItem.set("type", "main");
				
				BaseTreeModel resultItem = new BaseTreeModel();
				resultItem.set("name", "Result");
				resultItem.set("type", "frame");
				resultItem.set("src", basePath + "planner");
				
				treeStore.removeAll();
				treeStore.add(plannerItem, true);
				treeStore.add(resultItem, true);
				
				VerticalPanel vPanel = new VerticalPanel();
				vPanel.setWidth("100%");
				vPanel.setHeight("100%");
				vPanel.add(topPanel);
				vPanel.add(conceptPanel);
				vPanel.add(learnerPanel);
				
				treePanel.setWidget(tree);
				
				contentPanel.setWidget(vPanel);
			}
		});

		toolBar.add(learningDesignsButton);
		Button metadatasButton = new Button("Metadatas");
		metadatasButton.addSelectionListener(new SelectionListener<ButtonEvent>() {			

			public void componentSelected(ButtonEvent ce) {
				principalPanel.setHeading("Metadatas");
				treePanel.setWidget(new MetadataTreePanel(contentPanel));
				contentPanel.setWidget(new Label("Select one item of right menu"));
			}
		});
		toolBar.add(metadatasButton);
		Button resourcesButton = new Button("Resources");
		resourcesButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				principalPanel.setHeading("Resources");
				
				BaseTreeModel resourceItem = new BaseTreeModel();
				resourceItem.set("name", "Resource");
				resourceItem.set("type", "frame");
				resourceItem.set("src", basePath + "resources/list");
				
				treeStore.removeAll();
				treeStore.add(resourceItem, true);
				
				treePanel.setWidget(tree);
				
				contentPanel.setWidget(new Label("Select one item of right menu"));
			}
		});
		toolBar.add(resourcesButton);

		menuPanel.setTopComponent(toolBar);
		treePanel.setWidget(tree);
		menuPanel.add(treePanel);

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 200, 100, 300);
		westData.setMargins(new Margins(5, 0, 5, 5));
		westData.setSplit(true);
		container.add(menuPanel, westData);

		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);  
		centerData.setMargins(new Margins(5));  
		container.add(principalPanel, centerData);

		//		Frame frame = new Frame(basePath + "metadatas/concepts");
		//		frame.setWidth("100%");
		//		frame.setHeight("100%");
		//		center.add(frame);
		////////////////////////////////////////////////////////////////////////////////

		// TODO Re-factor to include in one function
		principalPanel.setHeading("Learning Design");
		
		BaseTreeModel plannerItem = new BaseTreeModel();
		plannerItem.set("name", "Planner");
		plannerItem.set("type", "main");
		
		BaseTreeModel resultItem = new BaseTreeModel();
		resultItem.set("name", "Result");
		resultItem.set("type", "frame");
		resultItem.set("src", basePath + "planner");
		
		treeStore.removeAll();
		treeStore.add(plannerItem, true);
		treeStore.add(resultItem, true);
		
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth("100%");
		vPanel.setHeight("100%");
		vPanel.add(topPanel);
		vPanel.add(conceptPanel);
		vPanel.add(learnerPanel);
		contentPanel.setWidget(vPanel);
		
		////////////////////////////////////////////////////////////////////////////////
		
		add(container);
	}

}
