package com.wcs.java.basics.exercises.vars;


public class VarsMain {
	
	public static void main(String[] args) {
		
		String name="david";
		int age;
		
		age = 2020 - 1974;
		
		
//		System.out.println(name);
		System.out.println(name + " " + "ist" + " " + age + " " + "alt.");
	
//		calculateAge(1974, 2020);
		calculateAge(1974);
		isOld(30);

	}
	
//	static void calculateAge(int year, int currentDate) { 
	static void calculateAge(int year) {
		
		int age;
		int currentDate=2020;
		
		age = currentDate - year;
		System.out.println(age);
		
	}
	
	static void isOld(int age) {
		
		
		
		if(age>0 && age<=30)
			System.out.println("wahr");
		else 
			System.out.println("falsch");
		
		
	}
	
	

}
