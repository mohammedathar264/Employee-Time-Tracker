package com.employee.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingleSession 
{
	public Session session;
	
	@Autowired
	public SingleSession(SessionFactory factory)
	{
		session=factory.openSession();
	}
}
