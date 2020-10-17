package com.creational.abstractfactory;

public class AbstarctFactoryExample {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		AbstractFactory carfactory = factory.getFactory("Company");
		CarCompany company =carfactory.getCompany("Tata");
		System.out.println("Company " + company.getName() +"  is located at "+company.getLocatio());
		
		
		AbstractFactory modelFactory =  factory.getFactory("Model");
		CarModel  model = modelFactory.getModel("ModelC");
		System.out.println("price of " + model.getModel() + " is "+ model.getPrice());
		
	}

}
