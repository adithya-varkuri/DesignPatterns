package com.creational.abstractfactory;

public class ModelB implements CarModel {

	@Override
	public String getPrice() {
		return "3000000";
	}
	
	@Override
	public String getModel() {
		return "ModelB";
	}

}
