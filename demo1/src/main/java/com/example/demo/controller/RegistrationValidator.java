package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modal.User;
import com.example.demo.services.UserService;

@Controller

public class RegistrationValidator {
	@Autowired
	UserService userService;
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		//String pass= "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\^&\*]).{4,20}";
		String regexPass = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{4,20}$";
	   
		//User userExists = userService.findByUsername(user.getUsername());
		if(user.getUsername().length()>21) {
		request.setAttribute("mode", "MODE_REGISTER");
	        return "welcomepage";
		}
		else if (!user.getUsername().matches(EMAIL_REGEX)) {
			request.setAttribute("mode", "MODE_REGISTER");
	        return "welcomepage";
		
		}
		else if(user.getPassword().length()>21) {
			request.setAttribute("mode", "MODE_REGISTER");
		        return "welcomepage";
			}
		else if (!user.getPassword().matches(regexPass)) {
			request.setAttribute("mode", "MODE_REGISTER");
	        return "welcomepage";
		
		}
		else if(user.getFirstname().length()>21) {
			request.setAttribute("mode", "MODE_REGISTER");
		        return "welcomepage";
			}
		else if(user.getLastname().length()>21) {
			request.setAttribute("mode", "MODE_REGISTER");
		        return "welcomepage";
			}
		
		
		
		else {
			userService.saveMyUser(user);
			request.setAttribute("mode", "MODE_DONE");
			return "welcomepage";
		}
	
	}
	
	

}
