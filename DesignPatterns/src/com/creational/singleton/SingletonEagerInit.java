package com.creational.singleton;

/**
 * Singleton with Eager initialization
 * Pros - Easy to implement 
 * Cons - Object is created even if it is not usefull
 */
public class SingletonEagerInit {
	
	// static variable single_instance of type Singleton 
	private static SingletonEagerInit obj = new SingletonEagerInit();
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingletonEagerInit() {
		name = "singleton" ;
	}
	
	//create instance
	public static SingletonEagerInit getObj() {
		return obj;
	}


}
