package com.company.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Car;
import com.company.service.CarDealershipService;

@RestController
@RequestMapping(path = "/car")
public class CarController {

	@Autowired
	CarDealershipService carService;

	@PostMapping(value = "")
	public Map<String, Object> createCar(@RequestParam(value = "carID") int carID,
			                             @RequestParam(value = "manufacturer") String manufacturer,
			                             @RequestParam(value = "price") double price) {
		
		carService.createCar(carID, manufacturer, price);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "Car added!");
		return map;
	}

	@GetMapping(path = "/getAllcars")
	List<Car> getAllCars() {
		return carService.getAllCars();

	}

	@GetMapping(path = "/{id}")
	Car getCarById(@PathVariable("id") int id) {
		return carService.getCarById(id);
	}

}
