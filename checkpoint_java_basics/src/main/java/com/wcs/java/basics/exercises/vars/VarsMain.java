package com.wcs.java.basics.exercises.vars;


public class VarsMain {
	
	static String name = "David";
	static int recentyear = 2020;
	static int birthyear = 1976;
	static int age;
	boolean old = true;
	
	public static int calculateAge(){
		age = recentyear - birthyear;
		return age;
	}
	
	
	public static boolean isOld() {
		if (age >30) {
		return true;
		}else{
		return false;	
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(name + " ist " + calculateAge() + " alt.");
		System.out.println("Ist " + name + " alt? " + isOld());
	}
	
}
