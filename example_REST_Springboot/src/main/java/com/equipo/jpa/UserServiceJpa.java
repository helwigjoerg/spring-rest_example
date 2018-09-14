package com.equipo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceJpa {
	
	@Autowired
	UserRepository userRepository;
	
	
	public User findone (Integer userId) {
		
		return userRepository.getOne(userId);
		
	}
	
	public void createUser(User user) {
		userRepository.save(user);
	}

}
