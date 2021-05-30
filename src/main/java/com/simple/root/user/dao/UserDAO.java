package com.simple.root.user.dao;

import com.simple.root.user.UserDTO;

public interface UserDAO {
	public int SaveUser(UserDTO dto);
	public UserDTO loginUser(String userName);

}
