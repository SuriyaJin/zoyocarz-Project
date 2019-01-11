package com.zoyocarz.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zoyocarz.domain.District;
import com.zoyocarz.services.LocationService;
import com.zoyocarz.services.VehicleService;

@Controller
@RequestMapping("vehicle")
public class VehicleController {
	
	@Autowired
	public VehicleService vehicleService;
	
	@Autowired
	public LocationService locationService;
	
	@RequestMapping("create")
	public ModelAndView create() {
		List<District> districtList = locationService.obtainAllDistricts();
		return new ModelAndView("vehicle/create","districtList",districtList);
	}
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public ModelAndView save(@RequestParam("name")String name,@RequestParam("vehicleNo")String vehicleNo,@RequestParam("pricePerKm")Double pricePerKm,@RequestParam("districtId")Integer districtId,@RequestParam("vehicleImage")MultipartFile vehicleImage) throws IOException {
		byte[] image = vehicleImage.getBytes();
		vehicleService.saveVehicle(name, pricePerKm, image, districtId, vehicleNo);
		return new ModelAndView("booking/index","message","Vehicle created successfully.");
	}
}
