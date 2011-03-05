
package br.usp.ime.cg.automatedld.server;

import br.com.caelum.vraptor.ComponentRegistry;
import br.com.caelum.vraptor.ioc.spring.SpringProvider;
import br.usp.ime.cg.automatedld.server.db.EntityManagerCreator;
import br.usp.ime.cg.automatedld.server.db.EntityManagerFactoryCreator;
import br.usp.ime.cg.automatedld.server.db.JPATransactionInterceptor;

public class CustomProvider extends SpringProvider {

	@Override
	protected void registerCustomComponents(ComponentRegistry registry) {
		registry.register(EntityManagerFactoryCreator.class, EntityManagerFactoryCreator.class);
		registry.register(EntityManagerCreator.class, EntityManagerCreator.class);
		registry.register(JPATransactionInterceptor.class, JPATransactionInterceptor.class);
	}

}
