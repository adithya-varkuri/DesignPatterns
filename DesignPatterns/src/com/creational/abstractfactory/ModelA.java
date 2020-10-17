package com.creational.abstractfactory;

public class ModelA implements CarModel {

	@Override
	public String getPrice() {
		return "200000";
	}

	@Override
	public String getModel() {
		return "ModelA";
	}

}
