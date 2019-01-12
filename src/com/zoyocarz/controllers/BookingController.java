package com.zoyocarz.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zoyocarz.services.LocationService;

@Controller
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	public LocationService locationService;
	
	@RequestMapping("index")
	public ModelAndView index() {
		HashMap<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("stateList",locationService.obtainAllStates());
		modelMap.put("districtList", locationService.obtainAllDistricts());
		return new ModelAndView("booking/index","modelMap",modelMap);
	}
	
	public ModelAndView search(@RequestParam("state")String state,@RequestParam("district")String district) {
		return null;
	}
}