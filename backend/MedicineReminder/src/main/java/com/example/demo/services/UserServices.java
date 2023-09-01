package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginCred;
import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;

@Service
@Transactional

public class UserServices {
	@Autowired
	private UserRepository userRepository;
	
	public User login(LoginCred login) {
		
		User user= userRepository.findByEmailIdAndPassword(login.getEmailId(), login.getPassword());
		if(user==null) {
			return null;
		}
		return user;
	}
    
	public User register(User user) {
		try {
		User userFromDB = userRepository.save(user);
		return userFromDB;
		}
		catch(Exception e) {
			return null;
		}
	
	}
	
	
	
	

}
