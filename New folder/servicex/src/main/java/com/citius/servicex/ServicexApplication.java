package com.citius.servicex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ServicexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicexApplication.class, args);
	}

	
}
