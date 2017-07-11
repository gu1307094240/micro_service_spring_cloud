package com.gu.cloud.springcloudprovideruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gu.cloud.springcloudprovideruser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
