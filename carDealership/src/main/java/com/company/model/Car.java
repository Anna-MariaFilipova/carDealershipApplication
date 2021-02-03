package com.company.model;

public class Car {

	private int carID;
	private String manufacturer;
	private double price;
	
	
	public Car(int carID, String manufacturer, double price) {
		super();
		this.carID = carID;
		this.manufacturer = manufacturer;
		this.price = price;
	}


	public int getCarID() {
		return carID;
	}


	public void setCarID(int carID) {
		this.carID = carID;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


}
