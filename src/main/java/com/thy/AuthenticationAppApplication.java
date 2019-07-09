package com.thy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthenticationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationAppApplication.class, args);
	}

}
