package com.zoyocarz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoyocarz.services.LocationService;

@Controller
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	public LocationService locationService;
	
	@RequestMapping("index")
	public String index() {
		return "booking/index";
	}
}