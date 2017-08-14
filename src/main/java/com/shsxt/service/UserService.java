package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsxt.dao.UserDao;

@Service
public class UserService {
	
		@Autowired
		private UserDao userDao;
		
	public void findUserById(String userName, String pwd){
		
	}
	
}
