package com.equipo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description="User testing Model")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id; 
	
	
	private String name;
	
	
	


	public User(String name) {
		super();
		this.name = name;
	}
	
	


	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
