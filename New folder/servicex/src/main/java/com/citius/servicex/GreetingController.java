package com.citius.servicex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Autowired
	private ServiceYProxy serviceYProxy;
	
	@GetMapping("/greet")
	public String greet() {
	
		return "Hello from Greeting Controller!! : " + serviceYProxy.getMessage();
		
	}
	}

