package com.wcs.java.basics.exercises.w3c.AquariumTest;

import java.util.ArrayList;
import java.util.List;

public class Guppi{

	private String aussehenGuppi;
	private String aussehenZurückGuppi;
	private int schwimmTiefe;
	private int schwimmGeschwindigkeit;
	private int position;

	public Guppi(int schwimmtiefe, int schwimmGeschwindigkeit, int position) {
		this.aussehenGuppi = "<><";
		this.aussehenZurückGuppi = "><>";
		this.schwimmTiefe = schwimmTiefe;
		this.schwimmGeschwindigkeit = schwimmGeschwindigkeit;
		this.position = position;
	}
	AquariumBecken aquariumBecken = new AquariumBecken();
	int tiefe = (aquariumBecken.aquariumBau().length)-1;
	int laenge = aquariumBecken.aquariumBau()[tiefe].length-1;
	
	public Guppi() {
	}


//	Guppi guppi2 = new Guppi("<><", "><>");

	

	/*
	 * wie kann man automatisiert Instanzen einer Klasse - hier Guppi" erzeugen?
	 * 
	 * Guppi[] guppiArray = new Guppi[tiefe];
	 * 
	 * public void fillGuppiArray() { for (int i = 0; i<tiefe; i++) { guppiArray[i]=
	 * Guppi guppi;
	 * 
	 */

	public String getAussehen() {
		return aussehenGuppi;
	}

	public void setAussehen(String aussehen) {
		this.aussehenGuppi = aussehen;
	}

	public String getAussehenZurück() {
		return aussehenZurückGuppi;
	}

	public void setAussehenZurück(String aussehenZurück) {
		this.aussehenZurückGuppi = aussehenZurück;
	}

	public int getSchwimmTiefe() {
		return schwimmTiefe;
	}

	public void setSchwimmTiefe(int schwimmTiefe) {
		this.schwimmTiefe = schwimmTiefe;
	}

	public int getSchwimmGeschwindigkeit() {
		return schwimmGeschwindigkeit;
	}

	public void setSchwimmGeschwindigkeit(int schwimmGeschwindigkeit) {
		this.schwimmGeschwindigkeit = schwimmGeschwindigkeit;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public AquariumBecken swim1() {
	
		aquariumBecken.aquariumBau();
		
		Guppi guppi = new Guppi(1, 1, 1);
		
		String[][] aquariumHuelleMitGuppi = aquariumBecken.aquariumBau();

		for (int i = 0; i < guppi.getAussehen().length(); i++) {
			aquariumHuelleMitGuppi[guppi.getSchwimmTiefe()][guppi.getPosition()+i] = guppi.getAussehen().substring(i, i+1);

			aquariumBecken.setAquariumHuelle(aquariumHuelleMitGuppi);
			
		}
		guppi.aquariumAusgabe();
		return aquariumBecken;
	}

	public void aquariumAusgabe() {
		for (int i = 0; i < tiefe; i++) {
			System.out.println();
			for (int j = 0; j < laenge; j++) {

				System.out.print(aquariumBecken.getAquariumHuelle()[i][j]);
			}
		}

//	int direction = 1;
//
//
//	public void swim() {
//
//		direction = direction * (-1);
//
//		int[] guppiWo = new int[] { guppi.getPosition(), guppi.getSchwimmTiefe() };
//
//		if (direction == 1) {
//
//			for (int i = 0; i < getAquariumBecken().aquariumBau()[guppi.getSchwimmTiefe()].length - 2
//					- getAussehen().length(); i++) {
//
//				int[] guppiWeiter = new int[] { guppi.getPosition() + guppi.getGeschwindigkeit(),
//						guppi.getSchwimmTiefe() };
//
//				guppi.setPosition(guppiWeiter[0]);
//
//			}
//		} else {
//
//			for (int i = 0; i < getAquariumBecken().aquariumBau()[guppi.getSchwimmTiefe()].length - 2
//					- getAussehen().length(); i++) {
//
//				int[] guppiWeiterZurueck = new int[] { guppi.getPosition() - guppi.getGeschwindigkeit(),
//						guppi.getSchwimmTiefe() };
//
//				guppi.setPosition(guppiWeiterZurueck[0]);
//			}
//		}
//		AquariumBecken aquariumBecken = new AquariumBecken();
//		aquariumBecken.addFisch(guppi);
//		aquariumBecken.addFisch(guppi2);
	}
}
