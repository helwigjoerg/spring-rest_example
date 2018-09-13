package com.equipo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiModel;


@ApiModel(description="UserController")
@RestController
public class UserController {
	
	@Autowired
	UserDaoService service;
	
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		return service.findAll();
		
	}
	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser (@RequestBody User user ) {
		service.save(user);
	}

}
