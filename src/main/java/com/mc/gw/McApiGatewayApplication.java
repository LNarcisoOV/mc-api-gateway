package com.mc.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class McApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(McApiGatewayApplication.class, args);
	}

}
