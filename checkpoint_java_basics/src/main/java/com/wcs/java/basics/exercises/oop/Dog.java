package com.wcs.java.basics.exercises.oop;

public class Dog extends Animal {

	private String color;

	public Dog(int legs, String name, String sound, boolean isAlive, String color) {
		super(legs, name, sound, isAlive);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String gattung() {
		return "Es ist ein Hund";
	}

}
