package com.telusko.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.telusko.secure.User;

public interface UserRepo extends JpaRepository<User, Long> {

	//@Query(value = "select * from user where userName = :'user')", nativeQuery = true)
	public User findByUserName(String user);

}
