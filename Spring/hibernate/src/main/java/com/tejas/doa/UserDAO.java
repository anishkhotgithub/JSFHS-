package com.tejas.doa;

import java.util.List;

import com.tejas.model.User;

public interface UserDAO 
{
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> displayUser();
}

