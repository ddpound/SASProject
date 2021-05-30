package com.simple.root.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("BoardWrite")
	public String BoardWrite() {
		return "/board/BoardWrite";
	}
	

}
