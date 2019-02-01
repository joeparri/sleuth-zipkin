package com.goa.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-4")
public interface FeignService4 {
	
	@GetMapping("/sayHello")
	String sayHello();

}
