package com.gu.cloud.springcloudconsumermovie.feign;

import org.springframework.stereotype.Component;

import com.gu.cloud.springcloudconsumermovie.entity.User;

@Component
public class HystrixClientFallback implements UserFeignClient {
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(0L);
		return user;
	}
}
