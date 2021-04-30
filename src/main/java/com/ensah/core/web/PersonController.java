package com.ensah.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ensah.core.services.IPersonService;

@Controller
public class PersonController {

	@Autowired
	private IPersonService personService;
	@RequestMapping("/test")
	public String tester() {
		return "test";
		
	}
}
