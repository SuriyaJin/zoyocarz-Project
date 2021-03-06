package com.zoyocarz.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.zoyocarz.services.LocationService;

@Controller
@RequestMapping("location")
public class LocationController {
	
	@Autowired
	public LocationService locationService;
	
	@RequestMapping("create")
	public String create() {
		return "location/create";
	}
	
	@RequestMapping("save")
	public ModelAndView save(@RequestParam("state")String stateName,@RequestParam("district")String districtName) {
		locationService.saveState(stateName, districtName);
		HashMap<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("stateList",locationService.obtainAllStates());
		modelMap.put("districtList", locationService.obtainAllDistricts());
		return new ModelAndView("booking/index","modelMap",modelMap);
	}

}
