package com.employee.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;
import com.employee.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveEmployee(Employee employee) 
	{
		employeeRepository.saveRecord(employee);
	}
	public List<Employee> getEmployeeList(String status) 
	{
		return employeeRepository.getList(status);
	}
}
