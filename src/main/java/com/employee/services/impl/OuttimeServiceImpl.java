package com.employee.services.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.TimeInfo;
import com.employee.repositories.EmployeeRepository;
import com.employee.repositories.TimeInfoRepository;
import com.employee.services.OuttimeService;
import com.employee.utitliy.TimeDateUtility;

@Service
public class OuttimeServiceImpl implements OuttimeService 
{
	@Autowired
	private TimeInfoRepository timeInfoRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	public void recordEmployeeOuttime(TimeInfo timeInfo) 
	{
		timeInfo.setOuttime(TimeDateUtility.getCurrentTime());
		timeInfo.setDate(LocalDate.now());
		timeInfoRepository.saveTime(timeInfo);
		employeeRepository.updateStatus("out",timeInfo.getEid());
	}
}
