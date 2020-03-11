package com.wcs.java.basics.exercises.oop;

public class Animal implements AnimalMethods {

	private int legs = 4;
	private String name;
	private String sound;
	private boolean isAlive = true;

	public Animal(int legs, String name, String sound, boolean isAlive) {
		super();
		this.legs = legs;
		this.name = name;
		this.sound = sound;
		this.isAlive = isAlive;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	@Override
	public void animalDies() {
		this.isAlive=false;
		
	}
	
	@Override
	public String makeNoise(String noise) {
		this.setSound(noise);
		return this.sound;
	}

}
