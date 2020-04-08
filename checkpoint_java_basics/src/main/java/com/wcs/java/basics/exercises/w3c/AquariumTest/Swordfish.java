package com.wcs.java.basics.exercises.w3c.AquariumTest;

import java.util.ArrayList;
import java.util.List;

public class Swordfish {

	String aussehenSwordFish;
	String aussehenZurückSwordFish;
	int schwimmTiefe;
	int schwimmGeschwindigkeit;
	int position;

	public Swordfish(int schwimmtiefe, int schwimmGeschwindigkeit, int position) {
		aussehenSwordFish = "--<()><";
		aussehenZurückSwordFish = "xxxx";
		this.schwimmTiefe = schwimmTiefe;
		
	
	}
	
	public Swordfish () {}
//	Guppi guppi = new Guppi("<><", "><>");
//	Guppi guppi2 = new Guppi("<><", "><>");

	public String getAussehen() {
		return aussehenSwordFish;
	}

	public void setAussehen(String aussehen) {
		this.aussehenSwordFish = aussehen;
	}

	public String getAussehenZurück() {
		return aussehenZurückSwordFish;
	}

	public void setAussehenZurück(String aussehenZurück) {
		this.aussehenZurückSwordFish = aussehenZurück;
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

	public void anzeige () {
	
	Swordfish guppi = new Swordfish(3, 1, 1);

	Swordfish guppi2 = new Swordfish(2, 2, 1);

	Swordfish guppi3 = new Swordfish(2, 2, 1);

	List<Swordfish> fishList = new ArrayList<Swordfish>();

	fishList.add(0, guppi);
	fishList.add(1, guppi2);
	fishList.add(2, guppi3);

	for (int i = 0; i < fishList.size(); i++) {
		System.out.println(fishList.get(i).getAussehen());
	
		}

	}
	
}

//	int direction = 1;
//
//	@Override
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
//	}
