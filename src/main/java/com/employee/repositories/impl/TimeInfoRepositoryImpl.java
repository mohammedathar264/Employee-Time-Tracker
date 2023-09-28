package com.employee.repositories.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entities.TimeInfo;
import com.employee.repositories.TimeInfoRepository;
import com.employee.session.SingleSession;

@Repository
public class TimeInfoRepositoryImpl implements TimeInfoRepository 
{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public TimeInfoRepositoryImpl(SingleSession singleSession)
	{
		session=singleSession.session;
		transaction=session.getTransaction();
	}
	public void saveTime(TimeInfo timeInfo) 
	{
		transaction.begin();
		session.save(timeInfo);
		transaction.commit();
	}
	public TimeInfo getTimeInfo(int eid) 
	{
		Query<TimeInfo> query=session.createQuery("from TimeInfo where eid=:arg1 and intime=:arg2",TimeInfo.class);
		query.setParameter("arg1",eid);
		query.setParameter("arg2","Not in yet");
		TimeInfo timeInfo=query.uniqueResult();
		return timeInfo;
	}
}
