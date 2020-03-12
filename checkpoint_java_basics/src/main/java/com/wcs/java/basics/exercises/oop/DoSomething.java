package com.wcs.java.basics.exercises.oop;

import java.util.ArrayList;
import java.util.List;

public class DoSomething {

	public static void main(String[] args) {
		 for(int i = 0; i < args.length; i++) {
	            System.out.println(args[i]);
	        }
		List<Animal> animals = new ArrayList<>();

		animals.add(new Cat(4, "Grumpy", "Miau", true, true));
		animals.add(new Dog(4, "fluffy", "Miau", true, "brown"));

//		System.out.println(animals.get(0).getSound());
//		animals.get(0).setSound("Schnurr");
//		System.out.println(animals.get(0).getSound());
//		System.out.println(animals.get(0).isAlive());
//		animals.get(0).animalDies();
//		System.out.println(animals.get(0).isAlive());
//		System.out.println(animals.get(1).isAlive());
		System.out.println(animals.get(1).makeNoise("wauwauwauwau"));
//
//		for (Animal anAnimal : animals) {
//			System.out.println(anAnimal.getName());
//		}
		
		System.out.println(getGattung(animals.get(0)));
		System.out.println(animals.get(0) instanceof AnimalMethods);
		System.out.println(animals.get(0) instanceof Animal);
		System.out.println(animals.get(0) instanceof Cat);
		System.out.println(animals.get(0) instanceof Dog);
		System.out.println(animals.get(1) instanceof AnimalMethods);
		System.out.println(animals.get(1) instanceof Dog);
		System.out.println(animals.get(1) instanceof Cat);
	
	}
	
	public static String getGattung(AnimalMethods method){
		String gattung = method.gattung();
		return gattung;
	}
	
	
}
