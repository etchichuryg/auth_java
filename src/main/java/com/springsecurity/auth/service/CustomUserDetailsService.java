package com.springsecurity.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import com.springsecurity.auth.model.User;
import com.springsecurity.auth.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService  {
	

	@Autowired 
	private UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User customer = userRepo.findByEmail(email);
        if (customer == null) {
            throw new UsernameNotFoundException("No customer found with the given email.");
        }
         
        return new CustomUserDetails(customer);
    }
 
	}
	


