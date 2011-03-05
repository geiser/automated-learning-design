package br.usp.ime.cg.automatedld.server.util;

import java.util.ArrayList;
import java.util.Collection;

import br.usp.ime.cg.automatedld.server.model.JShopParam;
import br.usp.ime.cg.automatedld.server.model.JShopParam.JShopParamType;
import br.usp.ime.cg.automatedld.server.model.LDOperator;
import br.usp.ime.cg.automatedld.server.model.LDOperator.OperatorType;
import br.usp.ime.cg.automatedld.server.model.LDParameter;
import br.usp.ime.cg.automatedld.server.model.LDPlan;
import br.usp.ime.cg.automatedld.server.model.LDTask;
import br.usp.ime.cg.automatedld.server.model.Metadata;
import br.usp.ime.cg.automatedld.server.model.Property;
import br.usp.ime.cg.automatedld.server.model.Relation;

import com.gamalocus.jshop2rt.Domain;
import com.gamalocus.jshop2rt.List;
import com.gamalocus.jshop2rt.Plan;
import com.gamalocus.jshop2rt.Predicate;
import com.gamalocus.jshop2rt.State;
import com.gamalocus.jshop2rt.Term;
import com.gamalocus.jshop2rt.TermConstant;
import com.gamalocus.jshop2rt.TermList;
import com.gamalocus.jshop2rt.TermNumber;

public class LDPlanFactory {

	private LDPlanFactory() { }

	public static LDPlan makePlan(Plan plan, Domain domain) {

		LDPlan toReturn = new LDPlan();
		LDOperator root = null;

		for (int i = 0; i < plan.getOps().size(); i++) {
			Predicate predicate = plan.getOps().get(i);

			String operatorHead = domain.getPrimitiveTasks()[predicate.getHead()];

			if (OperatorType.START_LD_ELEMENT.toString().equals(operatorHead)) {
				LDOperator operator = jshopToLDOperator(root, predicate);
				if (root != null) {
					root.addOperatorToPlan(operator);
				} else {
					toReturn.setLdOperator(operator);
				}
				root = operator;
			} else if (OperatorType.ADD_USER_TO_ROLE.toString().equals(operatorHead)) {
				List args = ((TermList) predicate.getParam()).getList();

				TermConstant userJShop = (TermConstant) args.getHead();
				TermConstant roleJShop = (TermConstant) args.getRest().getHead();
				//(!addUserToRole ?l ?newRole)

				LDParameter userParameter = new LDParameter();
				userParameter.setName("user");
				userParameter.setValue("" + userJShop.getName());

				LDParameter roleParameter = new LDParameter();
				roleParameter.setName("role");
				roleParameter.setValue(roleJShop.getName());

				LDOperator operator = new LDOperator();
				operator.setType(OperatorType.ADD_USER_TO_ROLE);
				operator.setRoot(root);
				operator.addParameter(userParameter);
				operator.addParameter(roleParameter);

				// .. add resource to plan
				root.addOperatorToPlan(operator);
			}  else if (OperatorType.INSERT_RESOURCE.toString().equals(operatorHead)) {
				List args = ((TermList) predicate.getParam()).getList();
				TermConstant elementJShop = (TermConstant) args.getHead();

				LDOperator operator = new LDOperator();
				operator.setType(OperatorType.INSERT_RESOURCE);
				operator.setElement(elementJShop.getName());
				operator.setRoot(root);
				// .. add resource to plan
				root.addOperatorToPlan(operator);
			} else if (OperatorType.END_LD_ELEMENT.toString().equals(operatorHead)) {
				root = root.getRoot();
			}
		}
		return toReturn;
	}

	private static LDOperator jshopToLDOperator(LDOperator root, Predicate predicate) {
		LDOperator toReturn = new LDOperator();
		toReturn.setType(OperatorType.START_LD_ELEMENT);

		// .. read JShop elements
		List args = ((TermList) predicate.getParam()).getList();				
		TermConstant elementJShop = (TermConstant) args.getHead();
		List parameterJShopList = null;
		List taskJShopList = null;
		if (args.getRest() != null) {
			parameterJShopList = ((TermList) args.getRest().getHead()).getList();
			if (args.getRest().getRest() != null) {
				taskJShopList = ((TermList) args.getRest().getRest().getHead()).getList();
			}
		}

		// .. add info of IMS element included root node
		toReturn.setElement(elementJShop.getName());
		toReturn.setRoot(root);

		// .. add all parameters
		java.util.List<LDParameter> parameters = getParameters(parameterJShopList);
		toReturn.setParameters(parameters);

		// .. add task used to generate this operator
		// sample:: (primitiveOrCompositeTask! (param1 param2 (param31 (param321 param322) param33) param4))
		if (taskJShopList != null) {
			LDTask taskLD = new LDTask();
			
			TermConstant sourceTask = (TermConstant) taskJShopList.getHead();
			taskLD.setTask(sourceTask.getName());
			java.util.List<JShopParam> params = getParamsFromTermList(((TermList) taskJShopList.getRest().getHead()).getList());
			taskLD.setParams(params);			
			taskLD.setOperator(toReturn);
		}

		return toReturn;
	}

	public static java.util.List<JShopParam> getParamsFromTermList(List list) {
		return getParamsFromTermListHelper(list, new ArrayList<JShopParam>());
	}

	private static java.util.List<JShopParam> getParamsFromTermListHelper(
			List list, ArrayList<JShopParam> toReturn) {
		if (list == null) {
			return toReturn;
		} else {
			Term term = list.getHead();
			if (term instanceof TermConstant) {
				TermConstant termConstant = (TermConstant) term;
				toReturn.add(new JShopParam(JShopParamType.TERMCONSTANT, termConstant.getName()));
			} else if (term instanceof TermNumber) {
				TermNumber termNumber = (TermNumber) term;
				toReturn.add(new JShopParam(JShopParamType.TERMNUMBER, termNumber.getNumber() + ""));
			} else if (term instanceof TermList) {
				TermList termList = (TermList) term;
				java.util.List<JShopParam> params = getParamsFromTermList(termList.getList());
				toReturn.add(new JShopParam(JShopParamType.TERMLIST).setParams(params));
			}
			return getParamsFromTermListHelper(list.getRest(), toReturn);
		}
	}

	private static java.util.List<LDParameter> getParameters(List parameterJShopList) {
		java.util.List<LDParameter> toReturn = new ArrayList<LDParameter>();
		return getParametersHelper(parameterJShopList, toReturn);
	}
	
	private static java.util.List<LDParameter> getParametersHelper(List parameterJShopList, java.util.List<LDParameter> toReturn) {
		if (parameterJShopList == null) {
			return toReturn;
		} else {
			List parameterJShop = ((TermList) parameterJShopList.getHead()).getList();
			TermConstant nameJShop = (TermConstant) parameterJShop.getHead();
			Term valueJShop = parameterJShop.getRest().getHead();
			if (valueJShop instanceof TermNumber) {
				toReturn.add(new LDParameter(nameJShop.getName(), ((TermNumber) valueJShop).getNumber() + "" ));
				return getParametersHelper(parameterJShopList.getRest() , toReturn);
			} else if (valueJShop instanceof TermConstant) {
				toReturn.add(new LDParameter(nameJShop.getName(), ((TermConstant) valueJShop).getName()));
				return getParametersHelper(parameterJShopList.getRest() , toReturn);
			} else if (valueJShop instanceof TermList) {
				List list = ((TermList) valueJShop).getList();
				while (list != null) {
					if (list.getHead() instanceof TermNumber) {
						toReturn.add(new LDParameter(nameJShop.getName(), ((TermNumber) list.getHead()).getNumber() + "" ));
					} else if (list.getHead() instanceof TermConstant) {
						toReturn.add(new LDParameter(nameJShop.getName(), ((TermConstant) list.getHead()).getName()));
					}
					list = list.getRest();
				}
				return getParametersHelper(parameterJShopList.getRest() , toReturn);
			}
			return getParametersHelper(parameterJShopList.getRest() , toReturn);
		}
	}
	
	/**
	 * Add a metadata in the current state of planning
	 * using 2-tuple: (?type ?identifier)
	 * e.g. (learner gcc.gcc@email)
	 * 		(resource http://www.ime.usp.br/23/re)
	 * 
	 * @param metadata
	 * @param state
	 * @param domain
	 * @return state
	 */
	public static State addMetadataToState(Metadata metadata, State state, Domain domain) {

		int headIn = domain.addConstant(metadata.getType());
		Term paramIn = new TermList(domain.getTermConstant(domain.addConstant(metadata.getIdentifier())) , TermList.NIL);
		Predicate jShop2reference = new Predicate(headIn, 0, paramIn);

		Collection<Term> arguments = state.getArguments(headIn);
		if (!arguments.contains(paramIn)) {
			state.add(jShop2reference);
			for (Property property : metadata.getProperties()) {
				addPropertyToState(property, state, domain);
			}
			for (Relation relation : metadata.getRelations()) {
				addRelationToState(relation, state, domain);
			}
		}

		return state;
	}

	/**
	 * Add a property of metadata in the current state of planning using 
	 * the tuples:
	 *     (property ?id ?name ?value)
	 *     (property ?id ?name ?resource) or
	 *     (property ?id ?name ?resource ?value)
	 * 
	 * @param property
	 * @param state
	 * @param domain
	 * @return state				  
	 */
	public static State addPropertyToState(Property property, State state, Domain domain) {

		boolean inverseProperty = false;

		int headIn = domain.addConstant("property");
		TermList paramIn = TermList.NIL;
		if (property.getValue() != null && !property.getValue().equals("")) {
			String value = property.getValue();
            if (("hasObjective".equals(property.getName()) && "concept".equals(property.getMetadata().getType())) //||
            	//("has".equals(property.getName()) && "learner".equals(property.getMetadata().getType()))
            	) {
                    paramIn = new TermList(domain.getTermConstant(domain.addConstant(value)), paramIn);
                    inverseProperty = true;
            } else {
                    paramIn = new TermList(domain.getTermConstant(domain.addConstant(value)), paramIn);
            }
		}
		if (property.getResource()!=null) {
			paramIn = new TermList(domain.getTermConstant(domain.addConstant(property.getResource().getIdentifier())), paramIn);
		}
		paramIn = new TermList(domain.getTermConstant(domain.addConstant(property.getName())), paramIn);
		paramIn = new TermList(domain.getTermConstant(domain.addConstant(property.getMetadata().getIdentifier())), paramIn);

		Collection<Term> arguments = state.getArguments(headIn);
		if (!arguments.contains(paramIn)) {
			Predicate jShop2Property = new Predicate(headIn, 0, paramIn);
			state.add(jShop2Property);
			if (inverseProperty){
				Predicate invjShop2Property = new Predicate(headIn, 0,
						new TermList(domain.getTermConstant(domain.addConstant(property.getResource().getIdentifier())),
								new TermList(domain.getTermConstant(domain.addConstant("inverseHasObjective")),
										new TermList(domain.getTermConstant(domain.addConstant(property.getMetadata().getIdentifier())), TermList.NIL))));
				state.add(invjShop2Property);
			}
		}

		if (property.getResource()!=null) {
			addMetadataToState(property.getResource(), state, domain);
		}

		return state;
	}

	/**
	 * Add a relation of metadata in the current state of planning using 
	 * the tuples:
	 *     (relation ?id ?name ?resource)
	 * 
	 * @param relation
	 * @param state
	 * @param domain
	 * @return
	 */
	public static State addRelationToState(Relation relation, State state, Domain domain) {

		int headIn = domain.addConstant("relation");
		Term paramIn = TermList.NIL;
		paramIn = new TermList(domain.getTermConstant(domain.addConstant(relation.getValue().getIdentifier())), paramIn);
		paramIn = new TermList(domain.getTermConstant(domain.addConstant(relation.getName())), paramIn);
		paramIn = new TermList(domain.getTermConstant(domain.addConstant(relation.getMetadata().getIdentifier())), paramIn);

		Collection<Term> arguments = state.getArguments(headIn);
		if (!arguments.contains(paramIn)) {
			Predicate jShop2Relation = new Predicate(headIn, 0, paramIn);
			state.add(jShop2Relation);
		}

		Term invParamIn = TermList.NIL;
		invParamIn = new TermList(domain.getTermConstant(domain.addConstant(relation.getMetadata().getIdentifier())), invParamIn);
		invParamIn = new TermList(domain.getTermConstant(domain.addConstant("inverse" + relation.getName().substring(0, 1).toUpperCase()  + relation.getName().substring(1))), invParamIn);
		invParamIn = new TermList(domain.getTermConstant(domain.addConstant(relation.getValue().getIdentifier())), invParamIn);
		if (!arguments.contains(invParamIn)) {
			Predicate jShop2Relation = new Predicate(headIn, 0, invParamIn);
			state.add(jShop2Relation);
		}


		addMetadataToState(relation.getValue(), state, domain);

		return state;
	}

}
