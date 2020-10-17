package com.creational.abstractfactory;

public class Tesla implements CarCompany {

	@Override
	public String getName() {
		return "Tesla";
	}
	
	@Override
	public String getLocatio() {
		return "Delhi";
	}

}
