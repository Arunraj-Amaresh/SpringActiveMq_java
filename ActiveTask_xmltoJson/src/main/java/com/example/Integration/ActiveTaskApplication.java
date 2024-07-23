package com.example.Integration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ActiveTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveTaskApplication.class, args);
	}
}
