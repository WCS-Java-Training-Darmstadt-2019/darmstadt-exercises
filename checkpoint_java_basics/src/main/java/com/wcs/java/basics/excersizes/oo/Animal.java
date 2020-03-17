package com.wcs.java.basics.excersizes.oo;

public class Animal {

	// Attribute
	private String animalType;
	private int age;
	private String name;

	public Animal(String animalType, int age, String name) {
		super();
		this.animalType = animalType;
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Methode
	public String sayHi() { 
		return null;

	}
}
