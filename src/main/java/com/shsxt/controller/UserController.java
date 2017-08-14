package com.shsxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shsxt.base.BaseController;
import com.shsxt.base.ResultInfo;
import com.shsxt.service.UserService;

@Controller
@RequestMapping("user")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;
	
	
	public ResultInfo login( String  userName , String password){
		
		
		
		return null;
	}
	

}
