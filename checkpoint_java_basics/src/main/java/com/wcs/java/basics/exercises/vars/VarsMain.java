package com.wcs.java.basics.exercises.vars;



public class VarsMain {
	
	public static int calculateAge(int yearOfBirth) {
		 
		return 2020 - yearOfBirth;
	}
	
	public static boolean isOld(int age) {
		if(age<31) {
			System.out.println("Du bist jung!");
			return false;
		}else {
			System.out.println("Du bist alt!");
			return true;
		}
	}
	
	public static void main(String[] args) {
		String name = "David";
		//int age;
		
		System.out.println(name+" ist "+calculateAge(1976)+ "alt.");
		
	}

}
