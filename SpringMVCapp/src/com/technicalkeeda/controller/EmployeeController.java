package com.technicalkeeda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/employee/")
@Controller
public class EmployeeController{
	@RequestMapping("/add.htm")
	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Added"); 
	}
	@RequestMapping("/delete.htm")
	public ModelAndView delete(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Deleted"); 
	}
	@RequestMapping("/update.htm")
	public ModelAndView update(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		return new ModelAndView("employee", "message", "Employee Updated"); 
	}
	
}
