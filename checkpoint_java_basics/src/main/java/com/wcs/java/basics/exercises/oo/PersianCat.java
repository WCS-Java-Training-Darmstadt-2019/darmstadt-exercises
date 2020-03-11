package com.wcs.java.basics.exercises.oo;

public class PersianCat extends Cat {

	
	Boolean longHair;

	public PersianCat(String species, int size, String name, Boolean longHair) {
		super(species, size, name);
		this.longHair = longHair;
	}

	public Boolean getLongHair() {
		return longHair;
	}

	public void setLongHair(Boolean longHair) {
		this.longHair = longHair;
	} 
	
	@Override
	public String soundsLike () {
		return "PersianMiau";
	}

}
