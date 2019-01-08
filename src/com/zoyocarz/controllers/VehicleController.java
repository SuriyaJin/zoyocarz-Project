package com.zoyocarz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoyocarz.services.VehicleService;

@Controller
@RequestMapping("vehicle")
public class VehicleController {
	
	@Autowired
	public VehicleService vehicleService;
	
	@RequestMapping("create")
	public String create() {
		return "vehicle/create";
	}
}
