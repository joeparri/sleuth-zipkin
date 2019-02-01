package com.goa.service4;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ms4Controller {
	
	private static final Logger LOG = Logger.getLogger(Ms4Controller.class.getName());

	@GetMapping(value="/sayHello")
	public String sayHello() throws InterruptedException {
		LOG.info("Inside Service 4..");
		
		return "Hi 4...";
	}
}
