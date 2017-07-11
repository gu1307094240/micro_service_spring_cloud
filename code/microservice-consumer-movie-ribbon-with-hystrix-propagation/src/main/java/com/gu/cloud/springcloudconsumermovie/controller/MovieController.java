package com.gu.cloud.springcloudconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gu.cloud.springcloudconsumermovie.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	@HystrixCommand(fallbackMethod = "findByIdFallback" , commandProperties = {@HystrixProperty(name = "extension.isolation.strategy" , value= "SEMAPHORE")})
	public User findById(@PathVariable Long id){
		return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
	}
	
	public User findByIdFallback(@PathVariable Long id){
		User user = new User();
		user.setId(0L);
		return user;
	}
	
}
