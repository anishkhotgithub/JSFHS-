package com.tejas.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping(value= {"","/","/home","/index"})
	public String m1()
	{
		return "index";
	}
	@RequestMapping(value= {"/adduser"})
	public String m2()
	{
		return "adduser";
	}

}
