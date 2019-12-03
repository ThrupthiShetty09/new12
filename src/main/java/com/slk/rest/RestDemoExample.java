package com.slk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoExample {
	
	@GetMapping("/Customer")
	public String getCustomers(){
		return "My Hello Rest";
	}

}
