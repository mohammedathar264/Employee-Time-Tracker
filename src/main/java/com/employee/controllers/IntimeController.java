package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.entities.Employee;
import com.employee.services.EmployeeService;
import com.employee.services.IntimeService;


@Controller
public class IntimeController 
{
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private IntimeService intimeService;
	
	@RequestMapping("in")
	public ModelAndView getEmployeeList()
	{
		List<Employee> employeeList=employeeService.getEmployeeList("out");
		ModelAndView mv=new ModelAndView();
		mv.addObject("elist",employeeList);
		mv.setViewName("time/in/employee-list");
		return mv;
	}
	@RequestMapping("update-intime")
	public String updateIntime(int eid)
	{
		intimeService.updateEmployeeIntime(eid);
		return "time/in/update-intime";
	}
}
