package com.creational.singleton;

public class Test {
	
	public static void main(String[] args) {
		
		//
		SingletonNoThreads obj = SingletonNoThreads.getObj();
		SingletonNoThreads obj1 = SingletonNoThreads.getObj();
		SingletonNoThreads obj2 = SingletonNoThreads.getObj();
		System.out.println(obj == obj1);
		System.out.println(obj1 == obj2);
		System.out.println(obj.name);
		System.out.println(obj1.name);
		
		
		
		SingletonThreadSafe objs = SingletonThreadSafe.getObj();
		SingletonThreadSafe objs1 = SingletonThreadSafe.getObj();
		SingletonThreadSafe objs2 = SingletonThreadSafe.getObj();
		System.out.println(objs == objs1);
		System.out.println(objs1 == objs2);
		
		
		
	}


}
