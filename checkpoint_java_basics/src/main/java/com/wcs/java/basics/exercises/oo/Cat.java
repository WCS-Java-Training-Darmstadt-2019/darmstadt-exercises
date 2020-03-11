package com.wcs.java.basics.exercises.oo;

public abstract class Cat extends Animal{

	String name;

	public Cat(String species, int size, String name) {
		super(species, size);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
