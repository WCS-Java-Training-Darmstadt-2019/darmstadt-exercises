package com.wcs.java.basics.excersizes.oo;

public class CatMain {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Wild Cat", 9, "Nicky");
		System.out.println(cat1.sayHi());
		System.out.println(cat1.getAge() + cat1.getAnimalType() + cat1.getName());
		System.out.println("I am a " + cat1.getAnimalType() + " and my name is " + cat1.getName() + " and I am " + cat1.getAge());
		
		
		Cat cat2 = new Cat("House Cat", 44, "Sam");
		System.out.println(cat2.getAge() + cat2.getAnimalType());
		cat2.setAge(55);
		System.out.println(cat2.getAge());
		
		
		Cat cat3 = new Cat("Persian Cat", 12, "Fusi");
		System.out.println(cat3.getAge() + cat3.getName());
		cat3.setAge(1);
		System.out.println(cat3.getAge());
		
		
		Cat bombo = new Cat ("African Cat", 22 , "miBruDer");
		System.out.println(bombo.getAnimalType() + " " + bombo.getName());
		
		
		Cat Lindar = new Cat ("Albanian Cat" , 24 , "Neroh");
		System.out.println(Lindar.getAge() + " " + Lindar.getAnimalType() + " " + Lindar.getName());
		System.out.println(Lindar.sayHi());
		
		
//		
//		Dog Dog1 = new Dog ("Tico" , 4, "Husky");
//		Dog1.sayHi();
//		System.out.println(Dog1.getAnimalType());
//		
//		
		
	
		
		
		
	}
}
	
	
