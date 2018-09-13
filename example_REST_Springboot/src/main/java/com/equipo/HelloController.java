package com.equipo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "We are in business!!!!";
	}
	
	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/helloBean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Bienvenidos");
	}
	
	
	

}
