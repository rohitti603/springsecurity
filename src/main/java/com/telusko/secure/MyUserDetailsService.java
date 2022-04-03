package com.telusko.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.secure.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User us = repo.findByUserName(username);
	if(us == null) 
		throw new UsernameNotFoundException("user not found"+username);
	
		return new UserPrinciple(us);
	
	}
}
