package com.company.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.company.model.Car;

@Service
public class ServiceImpl implements CarDealershipService {

	List<Car> cars = new ArrayList<Car>();
	
	
	public void createCar(int carID, String manufacturer, double price)
	{
		cars.add(new Car(carID, manufacturer, price ));
	}
	
	public List<Car> getAllCars() {
	
		return cars;
	}

	public Car getCarById(int id) {
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getCarID() == id) {
				return car;
			}
		}
		return null;

	}

}
