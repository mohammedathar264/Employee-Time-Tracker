package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.entities.Employee;
import com.employee.entities.TimeInfo;
import com.employee.services.EmployeeService;
import com.employee.services.OuttimeService;

@Controller
public class OuttimeController 
{
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private OuttimeService outtimeService;
	
	@RequestMapping("out")
	public ModelAndView getEmployeeList()
	{
		List<Employee> employeeList=employeeService.getEmployeeList("in");
		ModelAndView mv=new ModelAndView();
		mv.addObject("elist",employeeList);
		mv.setViewName("time/out/employee-list");
		return mv;
	}
	@RequestMapping("record-outtime")
	public String recordOuttime(TimeInfo timeInfo)
	{
		outtimeService.recordEmployeeOuttime(timeInfo);
		return "time/out/record-outtime";
	}
}
