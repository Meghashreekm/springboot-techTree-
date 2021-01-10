package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.User;

public interface UserRepository extends CrudRepository<User, Integer> {	//<Entity, data type of id>
	
	public User findByUsernameAndPassword(String username, String password);


	
	
	
	//public User findByFirstnameAndLastname(String firstname, String lastname);
}