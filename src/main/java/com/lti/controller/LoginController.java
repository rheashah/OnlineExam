package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.User;
import com.lti.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(path="/login.lti",method=RequestMethod.POST) 
	
	public String login(@RequestParam("email") String email, @RequestParam("password") String password  , Map model){
		
		User user = loginService.login(email);
		String admin="A";
		if(email.equals(user.getUserEmail()) && password.equals(user.getUserPassword())){
			
			if(admin.equals(user.getUserRole())){
				return"adminhome.jsp";
			}
			else {
				return"studenthome.jsp";
			}
			
		}
		return "login.jsp";	
	}

}
