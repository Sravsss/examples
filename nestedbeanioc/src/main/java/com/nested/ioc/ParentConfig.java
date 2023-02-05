package com.nested.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nested.ioc.beans.Rocket;

@Configuration
public class ParentConfig {

	@Bean
	public Rocket rocket(@Value("${fuelType}") String fuelType, @Value("${capacity}") Integer capacity) {
		Rocket rocket = new Rocket();
		rocket.setFuelType(fuelType);
		rocket.setCapacity(capacity);
		System.out.println("Parent Config 1234");
		return rocket;
	}
}
