package com.revature.caliber.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
	
	public static String getTest() {
		return "Test";
	}
}
