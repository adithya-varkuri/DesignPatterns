package com.creational.singleton;

/**
 * Thread safe singleton with synchronized block 
 *
 */
public class SingTSSynBlock {
	
	// static variable single_instance of type Singleton 
	private static SingTSSynBlock obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingTSSynBlock() {
		name = "singleton" ;
	}
	
	//create instance
	public static  SingTSSynBlock getObj() {
		synchronized (SingTSSynBlock.class) {
			if (obj == null)
				obj = new SingTSSynBlock();
			return obj;
		}
	}



}
