package com.equipo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.jpa.User;
import com.equipo.jpa.UserServiceJpa;

@RestController
@RequestMapping("jpa")
public class UserServiceController {
	
	@Autowired
	UserServiceJpa userServiceJpa;
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable Integer userId) {
		return userServiceJpa.findone(userId);
	}
	
	
	
	
	

}
