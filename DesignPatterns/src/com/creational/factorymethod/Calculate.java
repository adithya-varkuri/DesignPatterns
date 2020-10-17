package com.creational.factorymethod;

public class Calculate {
	
	public static void main(String[] args) {
		VehicleFactory  factory = new VehicleFactory();
		Vehicle vehicle = factory.getvehicle("car");
		vehicle.getRate();
		vehicle.calculatePrice(2);
		
	}

}
