package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.att.*")
@Controller
public class SpringDockerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}
	
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
