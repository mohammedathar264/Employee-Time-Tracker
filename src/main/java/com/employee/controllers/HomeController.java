package com.employee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public ModelAndView getHomeView()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
}
