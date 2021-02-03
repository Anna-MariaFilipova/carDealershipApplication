package com.company.service;

import java.util.List;

import com.company.model.Car;

public interface CarDealershipService {
 
	void createCar(int carID, String manufacturer, double price); // This method create car and add it in ArrayList
	List<Car> getAllCars(); //This method get all cars that have been created and added in ArrayList
	Car getCarById(int id); //This method get the car whose id matches the id you are looking for
	
	//The implementations of the methods are in the com.company.service.ServiceImpl.java
}
