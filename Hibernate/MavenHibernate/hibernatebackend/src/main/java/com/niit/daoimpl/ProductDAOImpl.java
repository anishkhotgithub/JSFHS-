package com.niit.daoimpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.ProductDAO;
import com.niit.dbconfig.DbConfig;
import com.niit.model.Product;

public class ProductDAOImpl implements ProductDAO
{

	@Override
	public boolean addProduct(Product product) 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.save(product);
			tx.commit();
			return false;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean deleteProduct(Product product) 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.delete(product);
			tx.commit();
			return false;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.saveOrUpdate(product);
			tx.commit();
			return false;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
		}
	}

	@Override
	public List<Product> displayProducts() 
	{
		try
		{
			Session session=DbConfig.getSession();
			return session.createCriteria(Product.class).list();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return null;
		}
	}

}
