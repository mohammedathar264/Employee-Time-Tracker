package com.employee.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.TimeInfo;
import com.employee.repositories.EmployeeRepository;
import com.employee.repositories.TimeInfoRepository;
import com.employee.services.IntimeService;
import com.employee.utitliy.TimeDateUtility;

@Service
public class IntimeServiceImpl implements IntimeService 
{
	@Autowired
	private TimeInfoRepository timeInfoRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void updateEmployeeIntime(int eid) 
	{
		TimeInfo timeInfo=timeInfoRepository.getTimeInfo(eid);  
		String intime=TimeDateUtility.getCurrentTime();
		String outtime=timeInfo.getOuttime();
		String totaltime=TimeDateUtility.getTotalTime(intime,outtime);
		timeInfo.setIntime(intime);
		timeInfo.setTotaltime(totaltime);
		employeeRepository.updateStatus("in",eid);
	}
}
