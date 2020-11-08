package com.creational.singleton;


/**
 * Singleton with Eager initialization with static block
 * Pros - Easy to implement 
 * Cons - Object is created even if it is not usefull
 */
public class SingletonStaticBlock {
	
	// static variable single_instance of type Singleton 
	public static SingletonStaticBlock obj;
	public String name;
	
	static {
		obj = new SingletonStaticBlock();
	}
	
	// private constructor restricted to this class itself 
	private  SingletonStaticBlock() {
		name = "singleton" ;
	}
}
