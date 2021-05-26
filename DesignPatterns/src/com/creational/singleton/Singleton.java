package com.creational.singleton;

public class Singleton {

	public static void main(String[] args) {
		
		//singletonEagerInit(); 
		//SingletonLazyNoThreads(); 
		//SingletonThreadSafe();
		//SingletonLazyNoThreadsTest();
		SingletonThreadSafeTest();
	}

	public static void singletonEagerInit() {
		System.out.println("in Singleton , singletonEagerInit");
		SingletonEagerInit obj = SingletonEagerInit.getObj();
		SingletonEagerInit obj1 = SingletonEagerInit.getObj();
		System.out.println(obj == obj1);
	}

	public static void SingletonLazyNoThreads() {
		System.out.println("in Singleton , SingletonLazyNoThreads");
		SingletonLazyNoThreads obj = SingletonLazyNoThreads.getObj();
		SingletonLazyNoThreads obj1 = SingletonLazyNoThreads.getObj();
		System.out.println(obj == obj1);
	}

	// when you execute this multiple objects might be created
	public static void SingletonLazyNoThreadsTest() {
		System.out.println("in Singleton , SingletonLazyNoThreadsTest");
		Thread t1 = new Thread(new ThreadSample());
		Thread t2 = new Thread(new ThreadSample());
		Thread t3 = new Thread(new ThreadSample());
		t1.start();
		t2.start();
		t3.start();
	}

	public static void SingletonThreadSafe() {
		System.out.println("in Singleton , SingletonThreadSafe");
		SingletonThreadSafe obj = SingletonThreadSafe.getObj();
		SingletonThreadSafe obj1 = SingletonThreadSafe.getObj();
		System.out.println(obj == obj1);
	}

// when we execute this method ony one method will be created
	public static void SingletonThreadSafeTest() {
		System.out.println("in Singleton , SingletonThreadSafeTest");
		Thread t1 = new Thread(new ThreadSafeSample());
		Thread t2 = new Thread(new ThreadSafeSample());
		Thread t3 = new Thread(new ThreadSafeSample());
		t1.start();
		t2.start();
		t3.start();
	}

}
