package com.creational.singleton;

/**
 * Singleton with Lazy initialization
 *
 */
public class SingletonNoThreads {
	
	// static variable single_instance of type Singleton 
	private static SingletonNoThreads obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingletonNoThreads() {
		name = "singleton" ;
	}
	
	//create instance
	public static SingletonNoThreads getObj() {
		if(obj == null)
			obj= new SingletonNoThreads();
		return obj;
	}
}
