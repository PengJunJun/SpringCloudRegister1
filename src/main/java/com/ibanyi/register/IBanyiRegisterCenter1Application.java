package com.ibanyi.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IBanyiRegisterCenter1Application {

	public static void main(String[] args) {
		SpringApplication.run(IBanyiRegisterCenter1Application.class, args);
	}
}
