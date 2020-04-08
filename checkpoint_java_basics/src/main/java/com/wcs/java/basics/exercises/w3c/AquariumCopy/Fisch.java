package com.wcs.java.basics.exercises.w3c.AquariumCopy;

public abstract class Fisch {

	private String aussehen;
	
	private String aussehenZurück;
	
	private int position;
	
	private int schwimmTiefe;
	
	private int geschwindigkeit;
	
	private AquariumBecken aquariumBecken;

	

	public Fisch(String aussehen, String aussehenZurück, int position, int schwimmTiefe, int geschwindigkeit) {
		super();
		this.aussehen = aussehen;
		this.aussehenZurück = aussehenZurück;
		this.position = position;
		this.schwimmTiefe = schwimmTiefe;
		this.geschwindigkeit = geschwindigkeit;
	}

	
	public String getAussehen() {
		return aussehen;
	}


	public void setAussehen(String aussehen) {
		this.aussehen = aussehen;
	}


	public String getAussehenZurück() {
		return aussehenZurück;
	}


	public void setAussehenZurück(String aussehenZurück) {
		this.aussehenZurück = aussehenZurück;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public int getSchwimmTiefe() {
		return schwimmTiefe;
	}


	public void setSchwimmTiefe(int schwimmTiefe) {
		this.schwimmTiefe = schwimmTiefe;
	}


	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}


	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}


	public AquariumBecken getAquariumBecken() {
		return aquariumBecken;
	}


	public void setAquariumBecken(AquariumBecken aquariumBecken) {
		this.aquariumBecken = aquariumBecken;
	}


	public abstract void swim (); 
	
}
