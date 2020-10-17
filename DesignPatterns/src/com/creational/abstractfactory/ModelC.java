package com.creational.abstractfactory;

public class ModelC implements CarModel {

	@Override
	public String getPrice() {
		return "5000000";
	}

	@Override
	public String getModel() {
		return "ModelC";
	}
}
