package com.company.carDealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.company.model","com.company.service","com.company.controller"})

public class CarDealershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDealershipApplication.class, args);
	}

}
