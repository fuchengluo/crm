package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsxt.dao.UserDao;
import com.shsxt.vo.User;


@Service
public class TestService {
	
	@Autowired
	private UserDao userDao;
	
	
	public User findById(Integer id) {
		User user = userDao.findById(id);
		return user;
	}
	
	
}
