package com.lib.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringController {

	@RequestMapping("/")
	public String welcome() {
		return "Hello Joginder....";
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello My Data.....";
	}
	
	
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage(){
		return new ModelAndView("welcome");
	}

}
