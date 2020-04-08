package com.wcs.java.basics.exercises.w3c.AquariumTest;

import java.util.ArrayList;
import java.util.List;

public class Bio {
	
	public void ausgabe () {
		
		Guppi guppi = (Guppi) new Fisch ();

		Guppi guppi2 = new Guppi(2, 2, 1);

		Guppi guppi3 = new Guppi(2, 2, 1);

		List<Guppi> fishList = new ArrayList<Guppi>();

		fishList.add(0, guppi);
		fishList.add(1, guppi2);
		fishList.add(2, guppi3);

		for (int i = 0; i < fishList.size(); i++) {
			System.out.println(fishList.get(i).getAussehen());
		
		
	}
	

}
