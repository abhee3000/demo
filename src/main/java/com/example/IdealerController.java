package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Idealer")
public class IdealerController {
	
	@RequestMapping(value = "/Car", method = RequestMethod.GET)
	public String getCar(){
		return "gotcar";
		
	}
	
	
	@RequestMapping(value = "/Truck", method = RequestMethod.GET)
	public String getTruck(){
		return "gottruck";
			
		}
	

}
