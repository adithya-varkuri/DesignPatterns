package com.creational.factorymethod;

public abstract class Vehicle {
	 protected double rate;  
     abstract void getRate();  

     public void calculatePrice(int units){  
          System.out.println(units*rate);  
      }  

}
