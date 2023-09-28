package com.employee.repositories.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;
import com.employee.session.SingleSession;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository 
{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public EmployeeRepositoryImpl(SingleSession singleSession)
	{
		session=singleSession.session;
		transaction=session.getTransaction();
	}
	public void saveRecord(Employee employee) 
	{
		transaction.begin();
		session.save(employee);
		transaction.commit();
	}
	public List<Employee> getList(String status) 
	{
		Query<Employee> query=session.createQuery("from Employee where status=:arg",Employee.class);
		query.setParameter("arg",status);
		return query.list();
	}
	public void updateStatus(String status,int eid) 
	{
		Employee emp=session.get(Employee.class,eid);
		transaction.begin();
		emp.setStatus(status);
		transaction.commit();
	}
}
