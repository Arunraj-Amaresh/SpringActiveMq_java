package com.example.Integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
public class ActiveTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveTaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
            MessageGateway gateway = context.getBean(MessageGateway.class);
            gateway.sendMessage("ActiveMq");
        };
    }
}
