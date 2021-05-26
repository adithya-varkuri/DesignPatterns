package com.creational.builder;

public class BuilderPattern {
	
	public static void main(String[] args) {
		//with out builder pattern
		Person person = new Person("adithya", 0, "red", 0, "address");
		
		
		//with builder pattern
		PersonWithBuilder personWithBuilder =new PersonWithBuilder.PersonsBuilder() .name("adithya").age(20).build();
		System.out.println(personWithBuilder);
		
		PersonWithBuilder personWithBuilderb =new PersonWithBuilder.PersonsBuilder().name("adithya").address("none").build();
		System.out.println(personWithBuilderb);
		
		
	}

}
