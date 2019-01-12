package com.zoyocarz.controllers;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zoyocarz.domain.User;
import com.zoyocarz.pojo.SessionEntity;
import com.zoyocarz.services.LocationService;
import com.zoyocarz.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public LocationService locationService;
	
	@RequestMapping("index")
	public String index() {
		return "user/index";
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam()String username,@RequestParam("password")String password,HttpSession session) {
		User userIns = null;
		HashMap<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("stateList",locationService.obtainAllStates());
		modelMap.put("districtList", locationService.obtainAllDistricts());
		userIns = userService.login(username, password);
		if(userIns != null) {
			SessionEntity sessionEntity = new SessionEntity();
			sessionEntity.setUserIns(userIns);
			session.setAttribute("sessionEntity", sessionEntity);
			return new ModelAndView("booking/index","modelMap",modelMap);
		} else {
			return new ModelAndView("booking/index","message","Invalid Username or password.");
		}
	}
	
	@RequestMapping("signUp")
	public String signUp() {
		return "/user/signUp";
	}
	
	@RequestMapping("createUser") 
	public ModelAndView createUser(@RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName,@RequestParam("password")String password,@RequestParam("mobileNumber")String mobileNumber,@RequestParam("email")String email,@RequestParam("street")String street,@RequestParam("city")String city,@RequestParam("state")String state,@RequestParam("pincode")String pincode){
		userService.createUser(firstName, lastName, password, mobileNumber, email, street, city, state, pincode);
		HashMap<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("stateList",locationService.obtainAllStates());
		modelMap.put("districtList", locationService.obtainAllDistricts());
		return new ModelAndView("booking/index","modelMap",modelMap);
	}
	
	@RequestMapping("logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		HashMap<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("stateList",locationService.obtainAllStates());
		modelMap.put("districtList", locationService.obtainAllDistricts());
		return new ModelAndView("booking/index","modelMap",modelMap);
	}
}
