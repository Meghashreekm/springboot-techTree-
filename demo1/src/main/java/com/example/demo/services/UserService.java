package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.example.demo.modal.User;
import com.example.demo.repository.UserRepository;

@Service
@Transactional //db tranaction
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {//constructor
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user ) { //User is class in modal and user is instance
		userRepository.save(user);
	}
	
	
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
//	public void deleteMyUser(int id) {
//		userRepository.delete(id);
//	}
//	
//	public User editUser(int id) {
//		return userRepository.findOne(id);
//	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	

	
//	public User findByFirstnameAndLastname(String firstname,String lastname) {
//	
//		  User existingProduct = userRepository.findById(user.getId()).orElse(null);
//	        existingProduct.setFirstname(User.getFirstname());
//	        existingProduct.setQuantity(user.getQuantity());
//	        existingProduct.setPrice(user.getPrice());
//	        return userRepository.save(existingProduct);
//	}
	}