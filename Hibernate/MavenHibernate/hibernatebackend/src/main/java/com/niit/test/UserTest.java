package com.niit.test;
import com.niit.dao.UserDAO;
import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.User;

public class UserTest 
{
	public static void main(String[] args) 
	{
		UserDAO udi=new UserDAOImpl();
		User u=new User(123,"Govind","govind@gmail.com","Pass@123");
		udi.addUser(u);
	}
}
