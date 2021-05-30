package com.simple.root.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.simple.root.user.UserDTO;
import com.simple.root.user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userMapper;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	
	@Override
	public int saveUser(Map<String, Object> dto) {
		UserDTO userdto = new UserDTO();
		UserDTO overlapResult = userMapper.loginUser((String)dto.get("userName"));
		
		// 로그인 select문이 null이 아니라는 뜻은 즉 이미 있는 아이디가 있다는 뜻
		if(overlapResult != null) {
			return -1;  //문제가 생김, 이미있는 아이디
		}

		String securPW = encoder.encode((String)dto.get("password"));
		
		
		
		
		userdto.setUserName((String)dto.get("userName"));
		userdto.setPassword(securPW);
		userdto.setCreateDate(null);
		
		try {
			userMapper.SaveUser(userdto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 1; //  정상적으로 처리
	}




	@Override
	public int loginUser(String userName, String password) {
		UserDTO inDto = new UserDTO();
		
		// 이게 결과값
		try {
			inDto = userMapper.loginUser(userName);
			System.out.println(inDto.getUserName());
			
			if(inDto != null) {
				// 결과값이 있다면 아이디가 있는거니깐 
				if(encoder.matches(password, inDto.getPassword())) {
					return 1;
					//로그인성공
				}else {
					return 0; //비밀번호가 틀릴때
				}
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		return -1; // 아이디도 없을때
	}
	
	
	
	
	
}
