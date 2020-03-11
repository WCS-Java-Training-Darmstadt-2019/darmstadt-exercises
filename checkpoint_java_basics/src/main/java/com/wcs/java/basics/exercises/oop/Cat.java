package com.wcs.java.basics.exercises.oop;

public class Cat extends Animal{
	
	private boolean isLazy;
	

	public Cat(int legs, String name, String sound, boolean isAlive, boolean isLazy) {
		super(legs, name, sound, isAlive);
		this.isLazy = isLazy;
	}

	public boolean isLazy() {
		return isLazy;
	}

	public void setLazy(boolean isLazy) {
		this.isLazy = isLazy;
	}
	
	

}
