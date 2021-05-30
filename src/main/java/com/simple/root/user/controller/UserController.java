package com.simple.root.user.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.simple.root.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping(value = "joinView")
	public String JoinView() {
		return "user/JoinView";
	}
	
	@PostMapping(value = "saveUser" ,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String SaveUser(@RequestBody Map<String, Object> user) {
		int result =  us.saveUser(user);

		if (result == -1) {
			return "{\"saveResult\" : false}";
		}
		
		return "{\"saveResult\" : true}";
	}
	
	@GetMapping(value = "loginView")
	public String loginView() {
		return "user/loginView";
	}
	
	@PostMapping(value = "loginUser" , produces = "application/json; charset=utf-8")
	@ResponseBody
	public String Login(@RequestBody Map<String, Object> user,HttpSession session) {
		
		int result = us.loginUser((String)user.get("userName"),(String)user.get("password"));
		
		
	    
		if(result == 1) {
			session.setAttribute("ResultUserName", (String)user.get("userName"));
			return "{\"loginResult\" : true}";
		}else if(result == 0) {
			return "{\"loginResult\" : false}";
		}else {
			return "{\"loginResult\" : false}";
		}

	}
	
	@GetMapping("logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	

}
