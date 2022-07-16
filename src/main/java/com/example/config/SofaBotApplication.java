package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SofaBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofaBotApplication.class, args);
	}

}
