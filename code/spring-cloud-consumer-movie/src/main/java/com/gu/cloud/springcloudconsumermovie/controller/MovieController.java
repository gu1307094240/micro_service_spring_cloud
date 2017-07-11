package com.gu.cloud.springcloudconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gu.cloud.springcloudconsumermovie.entity.User;

@RestController
public class MovieController {

	@Value("${userServicePath}")
	public String userServicePath;

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id){
		return this.restTemplate.getForObject(userServicePath + id, User.class);
	}
	
	
}
