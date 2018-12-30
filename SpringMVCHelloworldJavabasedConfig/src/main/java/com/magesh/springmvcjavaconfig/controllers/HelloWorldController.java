package com.magesh.springmvcjavaconfig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(ModelMap modelMap)
	{
		modelMap.addAttribute("greeting", "Hello SpringMVC from java config");
		
		return "Greeting";
		
	}
@RequestMapping(method=RequestMethod.GET,value="/helloagain")
	public String sayHelloAgain(ModelMap modelMap)
	{
	modelMap.addAttribute("greeting", "Hello again SpringMVC from java config");
		return "Greeting";
		
	}
}
