package com.goa.service4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms4Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms4Application.class, args);
	}
}
