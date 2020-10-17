package com.creational.abstractfactory;

public class ModelFactory extends AbstractFactory {
	
	public CarModel getModel(String model) {
		if(model.equals(null))
			return null;
		else if(model.equals("ModelA"))
			return new ModelA();
		else if(model.equals("ModelB"))
			return new ModelB();
		else if(model.equals("ModelC"))
			return new ModelC();
		else
			return null;
	}

	@Override
	public CarCompany getCompany(String company) {
		return null;
	}

}
