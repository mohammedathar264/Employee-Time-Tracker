package com.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entities.Employee;
import com.employee.services.EmployeeService;

@Controller
public class EmployeeController
{
	@Autowired private EmployeeService employeeService; 
	
	@RequestMapping("add")
	public String getAddEmployeeView()
	{
		return "employee/add-employee";
	}
	@RequestMapping("save-record")
	public String saveEmployeeRecord(Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "employee/save-record";
	}
}
