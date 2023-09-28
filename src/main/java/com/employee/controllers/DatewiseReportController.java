package com.employee.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.constants.Handler;
import com.employee.constants.ViewPath;
import com.employee.entities.TimeInfo;
import com.employee.services.DatewiseReportService;
import com.employee.utitliy.TimeDateUtility;

@Controller
public class DatewiseReportController 
{
	@Autowired private DatewiseReportService datewiseReportService;
	
	@RequestMapping(value = Handler.DATEWISE)
	public ModelAndView getChooseDateView()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("cdate",LocalDate.now());
		mv.setViewName(ViewPath.DATEWISE_PATH+"choose-date");
		return mv;
	}
	@RequestMapping(value=Handler.DATEWISE+"/current")
	public ModelAndView getCurrentDateReportView()
	{
		List<TimeInfo> timeInfoList=datewiseReportService.getCurrentDateReport();
		ModelAndView mv=new ModelAndView();
		mv.addObject("clist",timeInfoList);
		mv.addObject("date",TimeDateUtility.changeDateFormat(LocalDate.now().toString()));
		mv.setViewName(ViewPath.DATEWISE_PATH+"current-date");
		return mv;
	}
	@RequestMapping(value=Handler.DATEWISE+"/any")
	public String getAnyDateReportView(Model model,String date)
	{
		List<TimeInfo> timeInfoList=datewiseReportService.getAnyDateReport(date);
		model.addAttribute("clist",timeInfoList);
		model.addAttribute("date",TimeDateUtility.changeDateFormat(date));
		return ViewPath.DATEWISE_PATH+"any-date";
	}
	@RequestMapping(value=Handler.DATEWISE+"/date-between")
	public String getDateBetweenReportView(Model model,String date1,String date2)
	{
		List<TimeInfo> timeInfoList=datewiseReportService.getDateBetweenReport(date1,date2);
		model.addAttribute("clist",timeInfoList);
		model.addAttribute("date1",TimeDateUtility.changeDateFormat(date1));
		model.addAttribute("date2",TimeDateUtility.changeDateFormat(date2));
		return ViewPath.DATEWISE_PATH+"date-between";
	}
}
