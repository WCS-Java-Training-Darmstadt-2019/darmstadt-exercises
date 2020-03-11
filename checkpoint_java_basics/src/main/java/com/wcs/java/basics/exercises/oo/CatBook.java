package com.wcs.java.basics.exercises.oo;

public class CatBook {

	public static void main (String [] args) {
		
		PersianCat whitePersian = new PersianCat("housecat", 30, "Catie", true); 
		FarmCat greyTiger = new FarmCat("sleepingcat", 45, "Lousy", false);
		FarmCat silverLion = new FarmCat("huntercat", 32, "Hunty", true);
				
		System.out.println("The cat " + whitePersian.getName() + " is a " + whitePersian.getSpecies() + " and it sounds like " + whitePersian.soundsLike());
		System.out.println("The cat " + greyTiger.getName() + " is a " + greyTiger.getSpecies() + " and it sounds like " + greyTiger.soundsLike());
		System.out.println("The cat " + silverLion.getName() + " is a " + silverLion.getSpecies() + " and it sounds like " + silverLion.soundsLike());
	}


	}

