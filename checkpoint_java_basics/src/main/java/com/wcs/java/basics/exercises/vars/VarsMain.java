package com.wcs.java.basics.exercises.vars;

public class VarsMain {

	public static int calculateAge(int geburtsJahr) {
		int age = 2020 - geburtsJahr;
		return age;
	}

	public static boolean isOld(int age) {
		if (age <= 30) {
			return false;
		} else
			return true;
	}

	public static void main(String[] args) {
		String name = "David";
		int age = calculateAge(1976);
		System.out.println(name + " ist " + age + " alt. Ist er deswegen alt? " + isOld(age));
	}
}