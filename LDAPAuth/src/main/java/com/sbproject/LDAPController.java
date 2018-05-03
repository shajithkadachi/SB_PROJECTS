package com.sbproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LDAPController {
	
	@GetMapping("/")
	public String index() {
		return "Welcome to the home page!";
	}
}
