package com.creational.singleton;

public class ThreadSafeSample implements Runnable {

	@Override
	public void run() {
		System.out.println("In ThreadSafeSample");
		SingletonThreadSafe obj = SingletonThreadSafe.getObj();
		System.out.println("ThreadSafeSample obj retrieved");
		
	}

}
