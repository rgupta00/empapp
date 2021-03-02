package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping(path = "hello")
	public String hello() {
		return "hello to spring boot rest";
	}
	@GetMapping(path = "hello2")
	public String hello2() {
		return "hello2 to spring boot rest";
	}
	
	@GetMapping(path = "hello3")
	public String hello3() {
		System.out.println("i love java");
		return "hello3 to spring boot rest";
	}
	
	
}
