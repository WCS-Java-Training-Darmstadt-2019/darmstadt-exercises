package com.wcs.java.basics.exercises.vars;

import java.util.Calendar;

public class VarsMain {
	
	private static int currentYear = 0;
	
	public static void main(String[] args) {
		String name;
		int age;
		
		currentYear = Calendar.getInstance().YEAR;
		
		name = "David";
		age = currentYear - 1976;
		
		System.out.println(name + " ist " + age + " alt");
	}
	
	private static int calculateAge(int geburtsjahr) {
		return currentYear - geburtsjahr;
	}
	
	private static boolean isOld(int age) {
		return age <=30 ? false : true;  // ;-)
	}

}
