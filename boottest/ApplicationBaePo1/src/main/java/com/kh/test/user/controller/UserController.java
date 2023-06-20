package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/index")
	public String join(
			String userId,
			User user) {
		
		String result = service.join(userId ,user);
		
		String path= "redirect:";

		if(result == userId) {
			path = "searchSuccess";
		} else {
			path = "searchFail";
		}
		return path;
	}
}
	
