package com.employee.services;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeService 
{
	void saveEmployee(Employee employee);
	List<Employee> getEmployeeList(String status);
}
