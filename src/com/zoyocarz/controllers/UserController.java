package com.zoyocarz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("index")
	public String index() {
		return "user/index";
	}
	
	@RequestMapping("signUp")
	public String signUp() {
		return "/user/signUp";
	}
}
