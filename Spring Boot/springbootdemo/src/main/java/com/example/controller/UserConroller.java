package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserConroller 
{
	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public String m1(ModelMap map)
	{
		map.addAttribute("usrs",repo.findAll());
		return "users";
	}
	
	@GetMapping("/add")
	public String m3(ModelMap map)
	{
		map.addAttribute("user",new User());
		return "adduser";
	}
	
	@PostMapping("/add")
	public String m2(@ModelAttribute("user") User user)
	{
		repo.save(user);
		return "redirect:/user/";
	}
}
