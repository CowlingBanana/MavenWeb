package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neo.model.EmployeeSpring;
import com.neo.services.EmployeeService;

public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value="/saveEmp", method=RequestMethod.POST)
	public String savesEmp(@ModelAttribute("employee") EmployeeSpring e) {
		
		System.out.println("From Controller..");
		empService.saveEmployee(e);
		return "addEmp";
		
	}
	
}
