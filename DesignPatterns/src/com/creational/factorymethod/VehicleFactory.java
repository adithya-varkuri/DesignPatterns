package com.creational.factorymethod;

public class VehicleFactory {
	
	public Vehicle getvehicle(String vehicle) {
		if(vehicle==null) {
			return null;
		}
		else if(vehicle.equals("bike")) {
			return new Bike();
		}
		else if(vehicle.equals("car")) {
			return new Car();
		}
		else if(vehicle.equals("Train")) {
			return new Train();
		}
		return null;
		
		
	}

}
