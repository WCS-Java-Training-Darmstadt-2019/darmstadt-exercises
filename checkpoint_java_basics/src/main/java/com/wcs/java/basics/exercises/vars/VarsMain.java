package com.wcs.java.basics.exercises.vars;


public class VarsMain {
	
	static int calculateAge(int age) {
		return age;
	}
	
	static void isOld(int age) {
		if (age <= 30) {
			System.out.println("Zu Jung");
		}else {
			System.out.println("Zu alt");
		}
	}
	
	public static void main(String[] args) {
		
		String name ="David";
		int age = 2020-1976;
		System.out.println(name + " ist " + age + " Jahre alt.");
		
		calculateAge(age);
		System.out.println(age);
		
		isOld(age);
	}
}
