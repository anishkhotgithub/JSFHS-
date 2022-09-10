package com.niit.dbconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.niit.model.Product;
import com.niit.model.User;

public class DbConfig 
{
	private static SessionFactory factory=null;
	
	public static SessionFactory getFactory() {
		return factory;
	}


	public static void setFactory(SessionFactory factory) {
		DbConfig.factory = factory;
	}


	static
	{
		try
		{
			loadSessionFactory();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void loadSessionFactory()
	{
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(User.class);
		conf.addAnnotatedClass(Product.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		setFactory(conf.buildSessionFactory(registry));
	}
	
	
	public static Session getSession()
	{
		return getFactory().openSession();
	}
	
}
