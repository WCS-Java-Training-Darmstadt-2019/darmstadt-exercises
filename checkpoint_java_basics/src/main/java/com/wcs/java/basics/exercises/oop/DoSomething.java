package com.wcs.java.basics.exercises.oop;

public class DoSomething {

	public static void main(String[] args) {
		
		Cat grumpy = new Cat(4,"Grumpy", "Miau", true, true);
		
		System.out.println(grumpy.getSound());
		grumpy.setSound("Schnurr");
		System.out.println(grumpy.getSound());
		System.out.println(grumpy.isAlive);
		grumpy.animalDies();
		System.out.println(grumpy.isAlive);

	}

}
