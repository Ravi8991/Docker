package com.citius.servicey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class ServiceyApplication implements CommandLineRunner {

	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ServiceyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ResponseEntity<UserDTO[]> res = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users",
				UserDTO[].class);

		for (UserDTO user : res.getBody()) {
			System.out.println(user);

		}

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
