package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day1 {
	
	@GetMapping("/login")
	public String newLogin() {
		
		return "first time logine";
	}
	
	
	

}
