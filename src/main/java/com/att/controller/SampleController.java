package com.att.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@RequestMapping(value="/sayHello")
	@ResponseBody
	public String sayHello() {
		System.out.println("SayHello");
		return "Hello";
	}

}
