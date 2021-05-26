package com.creational.singleton;

public class ThreadSample implements Runnable {

	@Override
	public void run() {
		System.out.println("In ThreadSample");
		SingletonLazyNoThreads obj = SingletonLazyNoThreads.getObj();
		System.out.println("SingletonLazyNoThreads object retrieved");
	}

}
