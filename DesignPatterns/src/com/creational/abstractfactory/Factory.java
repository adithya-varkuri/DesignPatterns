package com.creational.abstractfactory;

public class Factory {
	
	public AbstractFactory getFactory(String name) {
		if(name.equals(null))
			return null;
		else if (name.equals("Company"))
			return new CarCompanyFactory();
		else if(name.equals("Model"))
			return new ModelFactory();
		else
			return null;
					
	}

}
