package com.gu.cloud.springcloudconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gu.cloud.springcloudconsumermovie.entity.User;
import com.gu.cloud.springcloudconsumermovie.feign.UserFeignClient;
import com.gu.cloud.springcloudconsumermovie.feign.UserFeignClient2;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@Autowired
	private UserFeignClient2 userFeignClient2;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id){
		return this.userFeignClient.findById(id);
	}
	
	@GetMapping("/{serviceName}")
	public String findServiceFromEurekaByServiceName(@PathVariable("serviceName") String serviceName){
		return this.userFeignClient2.findServiceFromEurekaByServiceName(serviceName);
	}
}
