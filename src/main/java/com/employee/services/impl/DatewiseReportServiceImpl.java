package com.employee.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.TimeInfo;
import com.employee.repositories.DatewiseReportRepository;
import com.employee.services.DatewiseReportService;

@Service
public class DatewiseReportServiceImpl implements DatewiseReportService 
{
	@Autowired
	private DatewiseReportRepository datewiseReportRepository;

	public List<TimeInfo> getCurrentDateReport() 
	{
		LocalDate date=LocalDate.now();
		return datewiseReportRepository.getDatewiseList(date);
	}
	public List<TimeInfo> getAnyDateReport(String date) 
	{
		LocalDate adate=LocalDate.parse(date);
		return datewiseReportRepository.getDatewiseList(adate);
	}
	public List<TimeInfo> getDateBetweenReport(String date1, String date2) 
	{
		LocalDate adate1=LocalDate.parse(date1);
		LocalDate adate2=LocalDate.parse(date2);
		return datewiseReportRepository.getDateBetweenList(adate1,adate2);
	}
}
