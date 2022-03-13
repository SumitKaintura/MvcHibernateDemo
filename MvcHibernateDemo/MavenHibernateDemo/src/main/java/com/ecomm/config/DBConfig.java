package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.entity.Product;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class DBConfig 
{
	//1. Creating a DataSource Object.
	@Bean
	public DataSource getMySQLDataSource()
	{	
		System.out.println("======== DataSource Bean Created ============");
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("Alphamale@123");
		return dataSource;
	}
	
	//2. Creating a bean for SessionFactory
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		System.out.println("======== SessionFactory Bean Created ============");
		//LocalSessionFactoryBuilder is a class in spring
		//It's constructor requires the dataSource object information which contain DB info

		LocalSessionFactoryBuilder factoryMgr=new LocalSessionFactoryBuilder(getMySQLDataSource());
		
		//We need to set the hibernate properties value to the LocalSessionFactoryBuilder
		Properties hibernateProp=new Properties();
		hibernateProp.put("hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		factoryMgr.addProperties(hibernateProp);
		
		//Here we are mapping the entity class to the LocalSessionFactoryBuilder
		factoryMgr.addAnnotatedClass(Product.class);
		
		//LocalSessionFactoryBuilder has a method called buildSessionFactory() which
		//returns the SessionFactory object
		return factoryMgr.buildSessionFactory();
		
	}
	
	
	//3. Hibernate Transaction Bean
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("======== Hibernate Transaction Bean Created ============");
		return new HibernateTransactionManager(sessionFactory);
	}
	
	
}
