package com.shristi.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration // class with all bean definitions
public class AppConfig {

	//spring reads the method annotated with @Bean and creates the object
	// the name of the spring bean will be the method name
	@Bean
	public Vehicle getVehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("Honda");
		vehicle.setPrice(9000);
		vehicle.setEngine(getEngine());
		return vehicle;
	}
	
	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setMileage("10km/hr");
		engine.setType("Petrol");
		return engine;
		
	}
	
}
