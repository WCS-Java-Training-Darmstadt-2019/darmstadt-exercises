package com.wcs.java.basics.exercises.oo;

public abstract class Animal {

	String species; 
	int size; 
	
	public Animal(String species, int size) {
		super();
		this.species = species;
		this.size = size;
	
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	} 
	
	public abstract String soundsLike ();
	
	
}
