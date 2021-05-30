package com.simple.root.user.service;

import java.util.Map;

import com.simple.root.user.UserDTO;

public interface UserService {
	public int saveUser(Map<String, Object> dto);
	public int loginUser(String userName, String password);
	
	
}
