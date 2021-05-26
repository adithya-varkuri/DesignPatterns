package com.creational.builder;

//This class represents person  with builder pattern
//This should be used only when you want to build different immutable objects using same object building process.
public class PersonWithBuilder {
	private  String name ;
	private  int height ;
	private  String color ;
	private  int age ;
	private  String address ;
	
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "PersonWithBuilder [name=" + name + ", height=" + height + ", color=" + color + ", age=" + age
				+ ", address=" + address + "]";
	}

	private PersonWithBuilder(PersonsBuilder builder) {
		this.name = builder.name;
		this.height =builder.height;
		this.color = builder.color;
		this.age = builder.age;
		this.address =  builder.address;
	}
	
	public static class PersonsBuilder{
		private  String name ;
		private  int height ;
		private  String color ;
		private  int age ;
		private  String address ;
		
		public PersonsBuilder name(String name ) {
			this.name = name;
			return this;
		}
		
		public PersonsBuilder height(int height ) {
			this.height = height;
			return this;
		}
		
		public PersonsBuilder color(String color ) {
			this.color = color;
			return this;
		}
		
		public PersonsBuilder age(int age ) {
			this.age = age;
			return this;
		}
		
		public PersonsBuilder address(String address ) {
			this.address = address;
			return this;
		}
		
		public PersonWithBuilder build() {
			return new PersonWithBuilder(this);
		}
		
		
	}

}
