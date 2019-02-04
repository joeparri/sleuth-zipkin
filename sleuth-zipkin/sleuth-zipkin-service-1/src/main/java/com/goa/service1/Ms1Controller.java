package com.goa.service1;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Ms1Controller {
	
	private static final Logger LOG = Logger.getLogger(Ms1Controller.class.getName());

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/sayHello")
	public String sayHello() {
		LOG.info("Inside Service 1..");
		
		String response = "Hi 1...";
		response = response.concat((String) restTemplate.exchange("http://service-2/sayHello", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
	        }).getBody());
		
		 
		return response;
	}
}
