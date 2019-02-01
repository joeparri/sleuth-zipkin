package com.goa.service3;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ms3Controller {
	
	private static final Logger LOG = Logger.getLogger(Ms3Controller.class.getName());
	
	@GetMapping(value="/sayHello")
	public String sayHello() {
		LOG.info("Inside Service 3..");
		
		return "Hi 3...";
	}
}
