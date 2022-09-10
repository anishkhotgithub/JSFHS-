package com.tejas.test;


import com.tejas.daoimpl.UserDAOImpl;
import com.tejas.doa.UserDAO;
import com.tejas.model.User;

public class UserTest 
{
	public static void main(String[] args) 
	{
		UserDAO udi=new UserDAOImpl();
		User u=new User(123,"tejas","tejas@gmail.com","Pass@123");
		udi.addUser(u);
	}
}
