package com.app.demo.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.jpa.model.User;
import com.app.demo.jpa.repo.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public String user() {
		return "hello";
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		if(user != null) {
			//This should be called from service layer
			userRepository.save(user);
			return "success";
		} else {
			return "fail";
		}
	}
}
