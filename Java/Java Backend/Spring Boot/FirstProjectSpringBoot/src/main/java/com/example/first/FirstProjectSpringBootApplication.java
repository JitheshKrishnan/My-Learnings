package com.example.first;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectSpringBootApplication.class, args);
		
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
