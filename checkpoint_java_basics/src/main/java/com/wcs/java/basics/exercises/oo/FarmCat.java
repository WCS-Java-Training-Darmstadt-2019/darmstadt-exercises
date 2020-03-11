package com.wcs.java.basics.exercises.oo;

public class FarmCat extends Cat {
	
	Boolean eatsMice;

	public FarmCat(String species, int size, String name, Boolean eatsMice) {
		super(species, size, name);
		this.eatsMice = eatsMice;
	}

	public Boolean getEatsMice() {
		return eatsMice;
	}

	public void setEatsMice(Boolean eatsMice) {
		this.eatsMice = eatsMice;
	}

	@Override
	public String soundsLike() {
		return "Very loud and agressive Miau";
	}


	

}
