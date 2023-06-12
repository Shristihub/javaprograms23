package com.shristi.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

	@Bean
	@Primary
	public NewEngine oneEngine() {
		NewEngine engine =  new NewEngine();
		engine.setType("Diesel");
		engine.setMileage("10");
		return engine;
	}
}
