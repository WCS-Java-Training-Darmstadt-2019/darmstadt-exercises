package com.wcs.java.basics.exercises.vars;


public class VarsMain {
	
	public static void main(String[] args) {
		String name = "David";
		int age;
		
		//age = 2020 - 1976;
		age = calculateAge (1976);
		
		System.out.println (name + " ist " + age + " Jahre alt");
		//System.out.println (name + " ist alt=" + isOld(age) +"!");
	}
	
	public static int calculateAge (int geburtsJahr) {
		return 2020 - geburtsJahr;
	}
	
	public static boolean isOld (int age) {
		return age>30;
		
	}
}
