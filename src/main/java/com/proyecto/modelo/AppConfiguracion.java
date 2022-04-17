package com.proyecto.modelo;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages={"com.proyecto"})
@EnableTransactionManagement
public class AppConfiguracion {

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
		LocalEntityManagerFactoryBean factorybean=new LocalEntityManagerFactoryBean();
		factorybean.setPersistenceUnitName("Proyecto-Spring");
		return factorybean;
	}  //fin del metodo local entity manager factory bean.....
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
		JpaTransactionManager transactionManager=new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
		
		
	}  //fin del metodo jpa transactionmanager .......
	
	
}   //fin de la clase appconfiguracion....
