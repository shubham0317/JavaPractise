package com.kodwewala.practise.day12;

public class Car {
   
	String carBrand;
	String modelName;
	int price;
	
	Car(String  _carBrand, String _modelName, int _price) {
		this.carBrand = _carBrand;
		this.modelName = _modelName;
		this.price = _price;
	}
	
	void displayCar() {
		System.out.println("Car Brand is " + carBrand + " and model name is " + modelName + " and the price of car is " + price);
	}
	
}
