package com.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "hello world!";
	}
	
}
