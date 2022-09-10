package com.tejas.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anish.doaimpl.UserDOAImpl;
import com.anish.model.User;



@Controller
@RequestMapping(value="/user")
public class UserController
{
	@RequestMapping(value="/add")
	public String m1(ModelMap map)
	{
		map.addAttribute("user",new User());
		return "adduser";
	}
	
	@RequestMapping(value="/adduser")
	public String m2(@ModelAttribute("user") User u)
	{
		UserDOAImpl udi=new UserDOAImpl();
		udi.addUser(u);
		return "index";
	}
	
}
