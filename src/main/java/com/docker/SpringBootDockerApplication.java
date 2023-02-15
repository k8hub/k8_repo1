package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@GetMapping("/isalive")
	public String isAlive() {
		System.out.println("isAlive");
		//System.out.println("test message");
		return "application is alive";
	}
	
}
