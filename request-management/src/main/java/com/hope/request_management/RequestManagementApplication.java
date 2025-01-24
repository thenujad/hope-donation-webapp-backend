package com.hope.request_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RequestManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestManagementApplication.class, args);
	}

}
