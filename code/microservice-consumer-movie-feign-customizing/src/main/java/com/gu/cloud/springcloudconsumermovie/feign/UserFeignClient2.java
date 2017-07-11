package com.gu.cloud.springcloudconsumermovie.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gu.cloud.config.Configuration2;

@FeignClient(name = "xxxx" , url = "http://localhost:8761/" , configuration = Configuration2.class)
public interface UserFeignClient2 {

	@RequestMapping(value = "/eureka/apps/{serviceName}")
	public String findServiceFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
	
}
