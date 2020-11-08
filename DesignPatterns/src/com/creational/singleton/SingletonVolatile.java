package com.creational.singleton;

/**
 * Singleton with Volatile
 * The  problem with double check lock  is that Thread A may assign a memory space for instance before it is finished constructing instance.
 * Thread B will see that assignment and try to use it. This results in Thread B failing because it is using a partially constructed version
 * of instance
 * http://tutorials.jenkov.com/java-concurrency/volatile.html
 *
 */
public class SingletonVolatile {


	
	// static variable single_instance of type Singleton 
	private static volatile SingletonVolatile obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingletonVolatile() {
		name = "singleton" ;
	}
	
	//create instance
	public synchronized static SingletonVolatile getObj() {
		if (obj == null) {
			synchronized (SingletonVolatile.class) {
				if (obj == null)
					obj = new SingletonVolatile();
			}
		}
		return obj;
	}





}
