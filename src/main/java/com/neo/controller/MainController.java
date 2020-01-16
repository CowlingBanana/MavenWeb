package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public String goMenu() {
		return "menu";
	}
	
	@RequestMapping(value="/empPage", method=RequestMethod.GET)
	public String goEmpPage() {
		return "addEmp";
	}
}
