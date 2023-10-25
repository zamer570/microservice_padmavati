package com.example.food_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FoodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceApplication.class, args);
	}

}
