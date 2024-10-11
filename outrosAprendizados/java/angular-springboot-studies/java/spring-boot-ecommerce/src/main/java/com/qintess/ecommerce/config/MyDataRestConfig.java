package com.qintess.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.qintess.ecommerce.entity.Product;
import com.qintess.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	public MyDataRestConfig(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		
		// desativar métodos http para Product: post, delete, put
		config.getExposureConfiguration()
				.forDomainType(Product.class)
				.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// desativar métodos http para ProductCategory: post, delete, put
				config.getExposureConfiguration()
						.forDomainType(ProductCategory.class)
						.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
						.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));	
		
		
		// chamar método de ajuda interna
				exposeIds(config);
	}
	
	private void exposeIds(RepositoryRestConfiguration config) {
		
		// expor entity ids
		
		// obter lista de todas as classes entity do entity manager
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		
		// criar um array dos entity types
		List<Class> entityClasses = new ArrayList<>();
		
		// obter a entity type para as entities
		for (EntityType tempEntityType : entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}
		
		// expor the entity ids para a array de entity/domain types
		Class[] domainTypes = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainTypes);
		
		
	}

}
