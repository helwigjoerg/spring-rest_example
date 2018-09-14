package com.equipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.equipo.jpa.User;
import com.equipo.jpa.UserServiceJpa;

@SpringBootApplication
public class ExampleRestSpringbootApplication  implements ApplicationRunner {
	
	@Autowired
	UserServiceJpa userServiceJpa;

	public static void main(String[] args) {
		SpringApplication.run(ExampleRestSpringbootApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		userServiceJpa.createUser(new User("Joerg"));
		userServiceJpa.createUser(new User("Billy"));
		userServiceJpa.createUser(new User("Willy"));
		
	}
	

}
