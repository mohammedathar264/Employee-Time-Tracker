package com.employee.repositories;

import java.time.LocalDate;
import java.util.List;

import com.employee.entities.TimeInfo;

public interface DatewiseReportRepository 
{
	List<TimeInfo> getDatewiseList(LocalDate date);
	List<TimeInfo> getDateBetweenList(LocalDate adate1, LocalDate adate2);
}
