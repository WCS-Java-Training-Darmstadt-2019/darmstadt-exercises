package com.wcs.java.basics.exercises.w3c.AquariumTest;

public abstract class Fisch {

	private String aussehen;
	
	private String aussehenZurück;
	
	private int schwimmTiefe;
	
	private int geschwindigkeit;
	
	private int position;

	
//	private AquariumBecken aquariumBecken;

	public Fisch () {}

	public Fisch(int schwimmTiefe, int geschwindigkeit, int position) {
		super();
//		this.aussehen = aussehen;
//		this.aussehenZurück = aussehenZurück;
		this.schwimmTiefe = schwimmTiefe;
		this.geschwindigkeit = geschwindigkeit;
		this.position = position; 
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
//
//
//	public int getPosition() {
//		return position;
//	}
//
//
//	public void setPosition(int position) {
//		this.position = position;
//	}
//
//
//	public int getSchwimmTiefe() {
//		return schwimmTiefe;
//	}
//
//
//	public void setSchwimmTiefe(int schwimmTiefe) {
//		this.schwimmTiefe = schwimmTiefe;
//	}
//
//
//	public int getGeschwindigkeit() {
//		return geschwindigkeit;
//	}
//
//
//	public void setGeschwindigkeit(int geschwindigkeit) {
//		this.geschwindigkeit = geschwindigkeit;
//	}


//	public AquariumBecken getAquariumBecken() {
//		return aquariumBecken;
//	}
//
//
//	public void setAquariumBecken(AquariumBecken aquariumBecken) {
//		this.aquariumBecken = aquariumBecken;
//	}
//


	
}
