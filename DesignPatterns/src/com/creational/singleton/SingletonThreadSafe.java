package com.creational.singleton;

/**
 *  singleton creation using thread safe and lazy initialization with synchronized method
 * 
 */
public class SingletonThreadSafe {
	
	// static variable single_instance of type Singleton 
	private static SingletonThreadSafe obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingletonThreadSafe() {
		name = "SingletonThreadSafe" ;
		System.out.println(name);
	}
	
	//create instance
	public synchronized static SingletonThreadSafe getObj() {
		if(obj == null)
			obj= new SingletonThreadSafe();
		return obj;
	}

}
