package com.employee.repositories.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entities.TimeInfo;
import com.employee.repositories.DatewiseReportRepository;
import com.employee.session.SingleSession;

@Repository
public class DatewiseReportRepositoryImpl implements DatewiseReportRepository 
{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public DatewiseReportRepositoryImpl(SingleSession ss)
	{
		session=ss.session;
		transaction=session.getTransaction();
	}
	public List<TimeInfo> getDatewiseList(LocalDate date) 
	{
		Query<TimeInfo> query=session.createQuery("from TimeInfo where date=:arg",TimeInfo.class);
		query.setParameter("arg",date);
		return query.list();
	}
	public List<TimeInfo> getDateBetweenList(LocalDate adate1, LocalDate adate2) 
	{
		Query<TimeInfo> query=session.createQuery("from TimeInfo where date between :arg1 and :arg2",TimeInfo.class);
		query.setParameter("arg1",adate1);
		query.setParameter("arg2",adate2);
		return query.list();
	}
}
