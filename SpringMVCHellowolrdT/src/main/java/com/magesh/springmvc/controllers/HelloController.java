package com.magesh.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public String welcome(ModelMap map)
	{
		map.addAttribute("greeting", "This is your springMVC helloworld");
		return "welcomejsp";
	}

}
