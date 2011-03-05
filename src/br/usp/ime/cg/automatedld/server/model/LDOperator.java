package br.usp.ime.cg.automatedld.server.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.tencompetence.imsldmodel.ILDModel;
import org.tencompetence.imsldmodel.activities.IActivityStructureModel;
import org.tencompetence.imsldmodel.activities.ILearningActivityModel;
import org.tencompetence.imsldmodel.activities.impl.ActivityStructureModel;
import org.tencompetence.imsldmodel.activities.impl.LearningActivityModel;
import org.tencompetence.imsldmodel.environments.IEnvironmentModel;
import org.tencompetence.imsldmodel.environments.ILearningObjectModel;
import org.tencompetence.imsldmodel.environments.impl.EnvironmentModel;
import org.tencompetence.imsldmodel.environments.impl.LearningObjectModel;
import org.tencompetence.imsldmodel.method.IActModel;
import org.tencompetence.imsldmodel.method.IPlayModel;
import org.tencompetence.imsldmodel.method.IRolePartModel;
import org.tencompetence.imsldmodel.method.impl.ActModel;
import org.tencompetence.imsldmodel.method.impl.PlayModel;
import org.tencompetence.imsldmodel.method.impl.RolePartModel;
import org.tencompetence.imsldmodel.resources.IResourceModel;
import org.tencompetence.imsldmodel.resources.impl.Resource;
import org.tencompetence.imsldmodel.roles.ILearnerModel;
import org.tencompetence.imsldmodel.roles.impl.LearnerRoleModel;
import org.tencompetence.imsldmodel.types.IItemType;
import org.tencompetence.imsldmodel.types.impl.ItemType;

@Entity
public class LDOperator implements Serializable, Cloneable {

	public Object clone() {
		LDOperator obj = new LDOperator();
		obj.setId(this.id);
		obj.setElement(this.element);
		obj.setParameters(this.parameters);
		obj.setPlan(this.plan);
		obj.setRoot(this.root);
		obj.setType(this.type);
		return obj;
	}

	private static final long serialVersionUID = 3528703188674716367L;

	public enum OperatorType {

		START_LD_ELEMENT ("!startLDElement"),
		END_LD_ELEMENT ("!endLDElement"),
		ADD_USER_TO_ROLE ("!addUserToRole"),
		INSERT_RESOURCE ("!insertResource");

		private String value;

		OperatorType(String value) {
			this.value = value;
		}

		public String toString(){
			return value;
		}

		public static OperatorType getByValue(String value){
			OperatorType returnValue = null;
			for (final OperatorType element : EnumSet.allOf(OperatorType.class)) {
				if (element.toString().equals(value)) {
					returnValue = element;
				}
			}
			return returnValue;
		}
	}

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private OperatorType type;

	private String element;

	@OneToMany(cascade=CascadeType.ALL, mappedBy= "operator")
	private List<LDParameter> parameters = new ArrayList<LDParameter>();
	
	@ManyToOne(optional = true)
	private LDOperator root;

	@OneToMany(mappedBy="root")
	private List<LDOperator> plan = new ArrayList<LDOperator>();
	
	@OneToOne(cascade=CascadeType.ALL, optional=true)
	@JoinColumn(name="LDTask_ID")
	private LDTask task;

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setType(OperatorType type) {
		this.type = type;
	}

	public OperatorType getType() {
		return type;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	public void setParameters(List<LDParameter> parameters) {
		List<LDParameter> parametersClone = new ArrayList<LDParameter>(this.getParameters());
		for (LDParameter parameter : parametersClone) {
			removeParameter(parameter);
		}
		for (LDParameter parameter : parameters) {
			addParameter(parameter);
		}
	}

	public List<LDParameter> getParameters() {
		return parameters;
	}

	public LDOperator addParameter(LDParameter parameter) {
		parameters.add(parameter);
		parameter.setOperator(this);
		return this;
	}

	public LDOperator removeParameter(LDParameter parameter) {
		parameters.remove(parameter);
		parameter.setOperator(null);
		return this;
	}

	public void setRoot(LDOperator root) {
		this.root = root;
	}

	public LDOperator getRoot() {
		return root;
	}

	public void setPlan(List<LDOperator> plan) {
		List<LDOperator> planClone = new ArrayList<LDOperator>(this.getPlan());
		for (LDOperator operator : planClone) {
			removeOperatorFromPlan(operator);
		}
		for (LDOperator operator : plan) {
			addOperatorToPlan(operator);
		}
	}

	public List<LDOperator> getPlan() {
		return plan;
	}

	public LDOperator addOperatorToPlan(LDOperator operator) {
		this.getPlan().add(operator);
		operator.setRoot(this);
		return this;
	}

	public LDOperator removeOperatorFromPlan(LDOperator operator) {
		this.getPlan().remove(operator);
		operator.setRoot(null);
		return this;
	}

	public void setTask(LDTask task) {
		this.task = task;
		if (this.task.getOperator() == null) { 
			this.task.setOperator(this);
		}
	}

	public LDTask getTask() {
		return task;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) { return true; }
		if (!(obj instanceof LDOperator) || (obj == null)) {
			return false;
		}
		LDOperator ldOperator = (LDOperator) obj;
		if (this.id != null) {
			return this.id.equals(ldOperator.getId());
		}
		boolean toReturn = (ldOperator.getType().equals(this.getType()) && ldOperator.getElement().equals(this.getElement()));
		Iterator<LDParameter> parametersOfObj = ldOperator.getParameters().iterator();
		while (parametersOfObj.hasNext()) {
			toReturn = toReturn && this.parameters.contains(parametersOfObj.next());
		}
		return toReturn;
	}
	
	public Object toIMS(ILDModel ldModel) {
		Object toReturn = null;
		if ("ld".equals(this.getElement())) {
			toReturn = toLDModel(ldModel);
		} else if ("play".equals(this.getElement())) {
			toReturn = toPlayModel(ldModel);
		} else if ("act".equals(this.getElement())) {
			toReturn = toActModel(ldModel);
		} else if ("role-part".equals(this.getElement())) {
			toReturn = toRolePartModel(ldModel);
		} else if ("activity-structure".equals(this.getElement())) {
			toReturn = toActivityStructureModel(ldModel);
		} else if ("learning-activity".equals(this.getElement())) {
			toReturn = toLearningActivityModel(ldModel);
		} else if ("activity-description".equals(this.getElement())) {
			toReturn = toActivityDescriptionModel(ldModel);
		} else if ("environment".equals(this.getElement())) {
			toReturn = toEnvironmentModel(ldModel);
		} else if ("learning-object".equals(this.getElement())) {
			toReturn = toLearningObjectModel(ldModel);
		}

		if (this.type.equals(OperatorType.INSERT_RESOURCE)) {
			toReturn = toResourceModel(ldModel);
		}

		return toReturn;
	}

	private ILDModel toLDModel(ILDModel ldModel) {
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				ldModel.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				ldModel.setTitle(parameter.getValue());
			} else if ("version".equals(parameter.getName())) {
				ldModel.setVersion(parameter.getValue());
			} else if ("uri".equals(parameter.getName())) {
				ldModel.setURI(parameter.getValue());
			} else if ("level".equals(parameter.getName())) {
				ldModel.setLevel(parameter.getValue());
			} else if ("sequence-used".equals(parameter.getName())) {
				ldModel.setIsSequenceUsed(Boolean.parseBoolean(parameter.getValue()));
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IPlayModel) {
				IPlayModel playModel = (IPlayModel) obj;
				ldModel.getMethodModel().getPlaysModel().addChildAt(playModel, -1);
			}
		}
		return ldModel;
	}

	private IPlayModel toPlayModel(ILDModel ldModel) {
		IPlayModel toReturn = new PlayModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("isvisible".equals(parameter.getName())) {
				toReturn.setIsVisible(Boolean.parseBoolean(parameter.getValue()));
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IActModel) {
				IActModel actModel = (IActModel) obj;
				toReturn.getActsModel().addChild(actModel);
			}
		}
		return toReturn;
	}

	private IActModel toActModel(ILDModel ldModel) {
		IActModel toReturn = new ActModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IRolePartModel) {
				IRolePartModel rolePartModel = (IRolePartModel) obj;
				toReturn.getRolePartsModel().addChild(rolePartModel);
			} else if (obj instanceof List<?>) {
				List<?> list = (List<?>) obj;
				for (Object object: list) {
					if (object instanceof IRolePartModel) {
						toReturn.getRolePartsModel().addChild((IRolePartModel) object);						
					}
				}
			}
		}
		return toReturn;
	}

	// TODO this method need to be correct in order to provide more efficient method
	private Object toRolePartModel(ILDModel ldModel) {
		List <String> learnerParams = new ArrayList<String>();
		
		IRolePartModel toReturn = new RolePartModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			} else if ("role-ref".equals(parameter.getName())) {
				// TODO substitute this way for another more efficient
				Iterator<ILearnerModel> learners = ldModel.getRolesModel().getLearners().iterator();
				boolean exits = false;
				while (learners.hasNext() && !exits) {
					ILearnerModel roleModel = learners.next();					
					if (roleModel.getIdentifier().equals(parameter.getValue())) {
						toReturn.setRole(roleModel);
						exits = true;
					}
				}
				if (!exits) {
					ILearnerModel roleModel = new LearnerRoleModel(ldModel);
					roleModel.setIdentifier(parameter.getValue());
					roleModel.setTitle(parameter.getName() + " - " + parameter.getValue());
					ldModel.getRolesModel().addChild(roleModel);
					toReturn.setRole(roleModel);
				}
			} else if ("learner".equals(parameter.getName())) {
				learnerParams.add(parameter.getValue().replaceAll("\\@","").replaceAll("\\.", ""));
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			// TODO this method must validate that only one element of IActivityStructureModel, LearningActivity, SupportActivity or LDElemnt is included
			if (obj instanceof IActivityStructureModel) {
				IActivityStructureModel activityStructureModel = (IActivityStructureModel) obj;
				toReturn.setComponent(activityStructureModel);
			} else if (obj instanceof ILearningActivityModel) {
				ILearningActivityModel learningActivityModel = (ILearningActivityModel) obj;
				toReturn.setComponent(learningActivityModel);
			}
		}
		
		if (!learnerParams.isEmpty()) {
			List<IRolePartModel> list = new ArrayList<IRolePartModel>();
			list.add(toReturn);
			// TODO refactoring this method to CC of level 1 using recursive
			for (String learnerId : learnerParams){
				IRolePartModel element = new RolePartModel(ldModel);
				element.setTitle(toReturn.getTitle());
				element.setComponent(toReturn.getComponent());
				
				// TODO substitute this way for another more efficient
				Iterator<ILearnerModel> learners = ldModel.getRolesModel().getLearners().iterator();
				boolean exits = false;
				while (learners.hasNext() && !exits) {
					ILearnerModel roleModel = learners.next();					
					if (roleModel.getIdentifier().equals(learnerId)) {
						element.setRole(roleModel);
						exits = true;
					}
				}
				if (!exits) {
					ILearnerModel roleModel = new LearnerRoleModel(ldModel);
					roleModel.setIdentifier(learnerId);
					roleModel.setTitle(learnerId);
					ldModel.getRolesModel().addChild(roleModel);
					element.setRole(roleModel);
				}
				////////////////////////////
				
				list.add(element);
			}
			return list;
		}
		
		return toReturn;
	}


	private IActivityStructureModel toActivityStructureModel(ILDModel ldModel) {
		IActivityStructureModel toReturn = new ActivityStructureModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			} else if ("number-to-select".equals(parameter.getName())) {
				toReturn.setNumberToSelect(Double.valueOf(parameter.getValue()).intValue());
			} else if ("structure-type".equals(parameter.getName())) {
				if ("selection".equals(parameter.getValue())) {
					toReturn.setStructureType(IActivityStructureModel.TYPE_SELECTION);
				} else if ("sequence".equals(parameter.getValue())) {
					toReturn.setStructureType(IActivityStructureModel.TYPE_SEQUENCE);
				}
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IActivityStructureModel) {
				IActivityStructureModel activityStructureModel = (IActivityStructureModel) obj;
				toReturn.addActivity(activityStructureModel, -1);
			} else if (obj instanceof ILearningActivityModel) {
				ILearningActivityModel learningActivityModel = (ILearningActivityModel) obj;
				toReturn.addActivity(learningActivityModel, -1);
			}
		}
		// TODO we must validate if the activity structure model exists in components 
		ldModel.getActivitiesModel().getActivityStructuresModel().addChild(toReturn);
		return toReturn;
	}

	private ILearningActivityModel toLearningActivityModel(ILDModel ldModel) {
		ILearningActivityModel toReturn = new LearningActivityModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			} else if ("isvisible".equals(parameter.getName())) {
				toReturn.setIsVisible(Boolean.parseBoolean(parameter.getValue()));
			}
		}

		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			// TODO we must validate an only one description to learning activity 
			if (obj instanceof IItemType) {
				IItemType item = (IItemType) obj;
				toReturn.getDescriptionModel().addChildItem(item);
			} if (obj instanceof IEnvironmentModel) {
				IEnvironmentModel env = (IEnvironmentModel) obj;
				toReturn.addEnvironmentRef(env);
			}
		}
		// TODO we must validate if learning activity model exists in components 
		ldModel.getActivitiesModel().getLearningActivitiesModel().addChild(toReturn);
		return toReturn;
	}

	private IItemType toActivityDescriptionModel(ILDModel ldModel) {
		IItemType toReturn = new ItemType(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("isvisible".equals(parameter.getName())) {
				toReturn.setIsVisible(Boolean.parseBoolean(parameter.getValue()));
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			}
		}
		// TODO must be validate to only one resource in activityDescription
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IResourceModel) {
				IResourceModel resourceModel = (IResourceModel) obj;
				toReturn.setIdentifierRef(resourceModel.getIdentifier());
			}
		}
		return toReturn;
	}

	private IEnvironmentModel toEnvironmentModel(ILDModel ldModel) {
		IEnvironmentModel toReturn = new EnvironmentModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof ILearningObjectModel) {
				ILearningObjectModel learningObjectModel = (ILearningObjectModel) obj;
				toReturn.addChildAt(learningObjectModel, -1);
			}
		}
		// TODO must be validate that environments doesn't exits
		ldModel.getEnvironmentsModel().addChild(toReturn);
		return toReturn;
	}

	private ILearningObjectModel toLearningObjectModel(ILDModel ldModel) {
		ILearningObjectModel toReturn = new LearningObjectModel(ldModel);
		for (LDParameter parameter : this.getParameters()) {
			if ("identifier".equals(parameter.getName())) {
				toReturn.setIdentifier(parameter.getValue());
			} else if ("isvisible".equals(parameter.getName())) {
				toReturn.setIsVisible(Boolean.parseBoolean(parameter.getValue()));
			} else if ("title".equals(parameter.getName())) {
				toReturn.setTitle(parameter.getValue());
			} else if ("class".equals(parameter.getName())) {
				toReturn.setClassType(parameter.getValue());
			} else if ("type".equals(parameter.getName())) {
				if ("none".equals(parameter.getValue())) {
					toReturn.setType(ILearningObjectModel.TYPE_NONE);
				} else if ("knowledge-object".equals(parameter.getValue())) {
					toReturn.setType(ILearningObjectModel.TYPE_KNOWLEDGE_OBJECT);
				} else if ("test-object".equals(parameter.getValue())) {
					toReturn.setType(ILearningObjectModel.TYPE_TEST_OBJECT);
				} else if ("tool-object".equals(parameter.getValue())) {
					toReturn.setType(ILearningObjectModel.TYPE_TOOL_OBJECT);
				}
			}
		}
		for (LDOperator operator : this.getPlan()) {
			Object obj = operator.toIMS(ldModel);
			if (obj instanceof IResourceModel) {
				IResourceModel resourceModel = (IResourceModel) obj;

				IItemType item = new ItemType(ldModel);
				//item.setIdentifier("item-" + resourceModel.getIdentifier());
				//item.setTitle("title :" + resourceModel.getType());
				item.setIsVisible(true);
				item.setIdentifierRef(resourceModel.getIdentifier());

				toReturn.getItems().addChildItem(item);
			}
		}
		// TODO test this learning-object must be included in how component ??
		return toReturn;
	}

	private IResourceModel toResourceModel(ILDModel ldModel) {
		IResourceModel toReturn = new Resource(ldModel);
		toReturn.setIdentifier("res-" + element.hashCode() * toReturn.hashCode());
		toReturn.setHrefAndResourceFile(this.element);
		// TODO validate that the resource doesn't exits
		ldModel.getResourcesModel().addResource(toReturn);
		return toReturn;
	}


	

}