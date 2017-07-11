package com.gu.cloud.springcloudprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gu.cloud.springcloudprovideruser.entity.User;
import com.gu.cloud.springcloudprovideruser.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id){
		return this.userRepository.findOne(id);
	}
	
}
