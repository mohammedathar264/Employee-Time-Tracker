package com.employee.services;

import java.util.List;

import com.employee.entities.TimeInfo;

public interface DatewiseReportService 
{
	List<TimeInfo> getCurrentDateReport();
	List<TimeInfo> getAnyDateReport(String date);
	List<TimeInfo> getDateBetweenReport(String date1, String date2);
}
