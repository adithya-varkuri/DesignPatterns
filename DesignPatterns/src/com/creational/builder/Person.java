package com.creational.builder;

//This class represents person  with out using builder pattern
public class Person {
	public  String name ;
	public  int height ;
	public  String color ;
	public  int age ;
	public  String address ;
	
	public Person(String name , int height , String color ,
	  int age ,String address) {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
				// TODO Auto-generated constructor stub
			}
	
	public Person(String name , int height ) {
				// TODO Auto-generated constructor stub
			}
	
	public Person(String name , int height , String color
			  ) {
				// TODO Auto-generated constructor stub
			}

}
