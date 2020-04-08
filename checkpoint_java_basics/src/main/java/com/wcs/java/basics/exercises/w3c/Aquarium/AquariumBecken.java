package com.wcs.java.basics.exercises.w3c.Aquarium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AquariumBecken {

	private String seitenElement = "|";
	private String bodenElement = "-";
	private String eckElement = "+";
	private String wasser = " ";
	private int hoehe = 14;
	private int breite = 40;
	Fisch fisch;
	List<Fisch> fischList = new ArrayList<Fisch>();
	SwordFish swordFish = new SwordFish("--<\\><", "><//>--", 1, 4, 2);
	
	
	public void addFisch(Fisch fisch) {
		this.fischList.add(fisch);
		fisch.setAquariumBecken(this);
		fischList.add(0, swordFish);
		
	}

	private String[][] aquariumHuelle = new String[hoehe][breite];

	public AquariumBecken() {
	}

	public String[][] getAquariumHuelle() {
		return aquariumHuelle;
	}

	public void setAquariumHuelle() {

	}

	public String getWasser() {
		return wasser;
	}

	public String[][] aquariumBau() {
		for (int i = 0; i < hoehe; i++) {
			aquariumHuelle[i][0] = seitenElement;
			aquariumHuelle[i][breite - 1] = seitenElement;
		}
		aquariumHuelle[hoehe - 1][0] = eckElement;
		aquariumHuelle[hoehe - 1][breite - 1] = eckElement;
		for (int i = 0; i < hoehe - 1; i++) {
			for (int j = 1; j < breite - 1; j++) {
				aquariumHuelle[i][j] = wasser;
			}
		}
		for (int j = 1; j < breite - 1; j++) {
			aquariumHuelle[hoehe - 1][j] = bodenElement;
		}
		for (int v = 0; v < fischList.size(); v++) {
			for (int w = 0; w < fischList.get(v).getAussehen().length(); w++) {
				aquariumHuelle[fischList.get(v).getSchwimmTiefe()][fischList.get(v).getPosition() + w] = fischList.get(v).getAussehen()
						.substring(w, w + 1);
			}
			SwordFish swordFish = new SwordFish("--<\\><", "><//>--", 1, 4, 2);
			fischList.set(0, swordFish);
System.out.println(fischList.get(0).getAussehen());			
		}
		return aquariumHuelle;
	}

	public void aquariumAusgabe() {
		for (int i = 0; i < hoehe; i++) {
			System.out.println();
			for (int j = 0; j < breite; j++) {
				System.out.print(aquariumBau()[i][j]);
			}

		}

	}
}