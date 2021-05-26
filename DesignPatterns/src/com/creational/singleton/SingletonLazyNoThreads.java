package com.creational.singleton;

/**
 * Singleton with Lazy initialization
 *
 */
public class SingletonLazyNoThreads {
	
	// static variable single_instance of type Singleton 
	private static SingletonLazyNoThreads obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingletonLazyNoThreads() {
		name = "SingletonLazyNoThreads" ;
		System.out.println(name);
	}
	
	//create instance
	public static SingletonLazyNoThreads getObj() {
		if(obj == null)
			obj= new SingletonLazyNoThreads();
		return obj;
	}
}
