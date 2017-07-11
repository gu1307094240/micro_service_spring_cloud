package com.gu.cloud.springcloudconsumermovie.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gu.cloud.springcloudconsumermovie.entity.User;


@FeignClient("microservice-provider-user")
public interface UserFeignClient {

	@RequestMapping(value = "/simple/{id}" , method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);//两个坑：1.@GetMapping不支持 2.@PathVariable需要设置value
	
	@RequestMapping(value = "/user" , method = RequestMethod.POST)
	public User postUser(@RequestBody User user);//只要参数是复杂 对象，即使制定了GET方法，feign依然会使用POST进行发送请求
}
