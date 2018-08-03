package com.revature.caliber.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	private String test = "Test";
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
	
	public String getTest() {
		return test;
	}
}
