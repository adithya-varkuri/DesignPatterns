package com.creational.abstractfactory;

public class CarCompanyFactory extends AbstractFactory {
	
	public CarCompany getCompany(String companyName) {
		
		if(companyName==null) 
			return null;
		else if (companyName.equals("Hundai"))
			return new Hundai();
		else if(companyName.equals("Tata"))
			return new Tata();
		else if(companyName.equals("Tesla"))
			return new Tesla();
		else
			return null;
				
	}


	@Override
	public CarModel getModel(String model) {
		return null;
	}

}
