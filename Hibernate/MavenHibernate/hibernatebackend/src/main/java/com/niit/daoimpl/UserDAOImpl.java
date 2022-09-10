package com.niit.daoimpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.UserDAO;
import com.niit.dbconfig.DbConfig;
import com.niit.model.User;

public class UserDAOImpl implements UserDAO
{

	@Override
	public boolean addUser(User user)
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}
	}
	

	@Override
	public boolean updateUser(User user) 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return false;
		}
	}

	@Override
	public List<User> displayUser() 
	{
		Transaction tx=null;
		try
		{
			Session session=DbConfig.getSession();
			return session.createQuery("from com.niit.model.User").list();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			tx.rollback();
			return null;
		}
	}

}
