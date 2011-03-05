package br.usp.ime.cg.automatedld.server.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.usp.ime.cg.automatedld.server.model.LDOperator;
import br.usp.ime.cg.automatedld.server.model.LDPlan;
import br.usp.ime.cg.automatedld.server.model.Metadata;

@Component
@RequestScoped
public class LDPlanDAO {

	private final EntityManager em;
	private final MetadataDAO dao;

	public LDPlanDAO(final EntityManager em, MetadataDAO dao) {
		this.em = em;
		this.dao = dao;
	}

	public LDPlan save(LDPlan plan) {

		// save concepts
		for (Metadata concept : plan.getConcepts()) {
			if (!(concept.getId() != null && concept.getId() != 0L)) {
				dao.save(concept);
			}
		}

		// save operator
		if (plan.getLdOperator()!=null) {
			saveInDephWay(plan.getLdOperator());
		}
		
		// save the plan
		if (plan.getId() != null && plan.getId() != 0L) {
			plan = em.merge(plan);
		} else {
			em.persist(plan);
		}

		return plan;
	}

	private LDOperator saveInDephWay(LDOperator ldOperator) {
		List<LDOperator> plan = ldOperator.getPlan();
		for (LDOperator ldOp : plan) {
			this.saveInDephWay(ldOp);
		}
		if (ldOperator.getId() != null && ldOperator.getId() != 0L) {
			ldOperator = em.merge(ldOperator);
		} else {
			em.persist(ldOperator);
		}
		return ldOperator;
	}

	public LDPlan findByKey(Long id) {
		LDPlan plan = null;
		plan = em.find(LDPlan.class, id);
		return plan;
	}

	@SuppressWarnings("unchecked")
	public List<LDPlan> list() {
		Query query = em.createQuery("SELECT x FROM " + LDPlan.class.getName() + " x ");
		return (List<LDPlan>) query.getResultList();
	}


}
