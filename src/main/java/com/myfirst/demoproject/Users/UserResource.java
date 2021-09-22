package com.myfirst.demoproject.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoServices service;
	
	//Get /users
	//Retrieve All Users
	@GetMapping("/users")
	public List<Users> retrieveAllUsers()
	{
		return service.findAll();
	}
	
	//Get /users /{id}
	//Retrieve User (int id )
	@GetMapping("/users/{id}")
	public Users retrieveUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
}
