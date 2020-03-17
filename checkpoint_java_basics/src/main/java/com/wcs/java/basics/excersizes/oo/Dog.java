package com.wcs.java.basics.excersizes.oo;

public class Dog extends Animal {

	public Dog(String animalType, int age, String name) {
		super(animalType, age, name);
	}
	
	@Override 
	public String sayHi() {
		return "I am a " + Dog.getName();
	}
}
