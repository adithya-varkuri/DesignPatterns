package com.creational.singleton;

/**
 * Thread safe singleton with  double check locking
 * It is not recommended to use  double check locking
 */
public class SingTSDoubleCheckLock {

	
	// static variable single_instance of type Singleton 
	private static SingTSDoubleCheckLock obj = null;
	public String name;
	
	// private constructor restricted to this class itself 
	private  SingTSDoubleCheckLock() {
		name = "singleton" ;
	}
	
	//create instance
	public synchronized static SingTSDoubleCheckLock getObj() {
		if (obj == null) {
			synchronized (SingTSDoubleCheckLock.class) {
				if (obj == null)
					obj = new SingTSDoubleCheckLock();
			}
		}
		return obj;
	}



}
