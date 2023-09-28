package com.employee.repositories;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeRepository 
{
	void saveRecord(Employee employee);
	List<Employee> getList(String status);
	void updateStatus(String status,int eid);
}
