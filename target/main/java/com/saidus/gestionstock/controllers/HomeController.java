package com.saidus.gestionstock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value = { "", "/"}, method = RequestMethod.GET)
	public String home() {
		return "home/home";
	}

	
	  @RequestMapping(value="/blank") 
	  public String blankHome() { 
		  
		  return "blank/blank"; 
		  
	  }
	 

}
