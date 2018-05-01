package com.profile.example.ProfileDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired 
	BasicConfiguration configuration;
	
	@RequestMapping("/name")
	public String getProfile() {
		return configuration.getMessage();
	}

}
