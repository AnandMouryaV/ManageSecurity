package com.example.springSecurity.Springsecurity.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/authenticated")
public class ControllerClass {
	
	@GetMapping("/security/hello/{name}")
	@ExceptionHandler
	public String getHello(@PathVariable String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/non-security/hello/{name}")
	public String getHi(@PathVariable String name) {
		return "Hi "+name;
	}

}
