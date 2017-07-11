package com.gu.cloud.springcloudconsumermovie.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import com.gu.cloud.config.Configuration1;
import com.gu.cloud.springcloudconsumermovie.entity.User;

import feign.Param;
import feign.RequestLine;


@FeignClient(name = "microservice-provider-user" , configuration = Configuration1.class)
public interface UserFeignClient {

	@RequestLine(value = "GET /simple/{id}")//feign注解@RequestLine
	public User findById(@Param("id") Long id);
	
}
