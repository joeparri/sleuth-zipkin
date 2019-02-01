package com.goa.service2;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ms2Controller {
	
	private static final Logger LOG = Logger.getLogger(Ms2Controller.class.getName());

	@Autowired
	private FeignService3 feignService3;
	
	@Autowired
	private FeignService4 feignService4;
	
	
	@GetMapping(value="/sayHello")
	public String sayHello() {
		LOG.info("Inside Service 2..");
		
		String response = "Hi 2...";
		
		response = response.concat(feignService3.sayHello());
		
		response = response.concat(feignService4.sayHello());
		
		return response;
	}
}
