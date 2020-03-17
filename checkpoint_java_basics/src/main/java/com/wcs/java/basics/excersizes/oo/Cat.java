package com.wcs.java.basics.excersizes.oo;

public class Cat extends Animal {

	public Cat(String animalType, int age, String name) {
		super(animalType, age, name);
	}
	

	@Override
	public String sayHi() {
			return "I am a cat";
		}
	}
