package com.example.springbootdockerv0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerV0Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerV0Application.class, args);
	}


	@RequestMapping("/")
	public String sayHello() {
		return "Hello !";
	}

}
