package br.usp.ime.cg.automatedld.server.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.resource.ResourceMethod;

@Component
@Intercepts
public class JPATransactionInterceptor implements Interceptor {

	private final EntityManager em;

	public JPATransactionInterceptor(EntityManager em) {
		this.em = em;
	}

	public void intercept(InterceptorStack stack, ResourceMethod method, Object instance) {
		EntityTransaction transaction = null;
		try {
			transaction = em.getTransaction();
			transaction.begin();
			stack.next(method, instance);
			transaction.commit();
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
		}
	}

	public boolean accepts(ResourceMethod method) {
		return !(method.getMethod().isAnnotationPresent(NonTransactional.class)
			|| method.getResource().getType().isAnnotationPresent(NonTransactional.class));
	}
	
}