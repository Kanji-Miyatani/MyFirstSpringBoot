package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboardApplication.class, args);
	}
	@RequestMapping("/hello")
	String index(){
		return "Hello World!";
	}
}
