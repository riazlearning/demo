package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	@GetMapping("msg/{userName}")
	public String helloMessage(@PathVariable String userName) {
		
		return  "Hello "+ userName;
	}

}
