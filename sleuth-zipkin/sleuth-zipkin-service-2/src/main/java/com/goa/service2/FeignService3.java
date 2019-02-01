package com.goa.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-3")
public interface FeignService3 {
	
	@GetMapping("/sayHello")
	String sayHello();

}
