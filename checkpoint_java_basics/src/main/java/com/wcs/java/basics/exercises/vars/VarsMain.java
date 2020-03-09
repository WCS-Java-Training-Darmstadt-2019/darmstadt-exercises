package com.wcs.java.basics.exercises.vars;

public class VarsMain {

	static int geburtsJahr = 1976;
	static int diesesJahr = 2020;
	static String name = "David";
	static int age = diesesJahr - geburtsJahr;

	static int calculateAge(int geburtsJahr, int diesesJahr) {
		int age = diesesJahr - geburtsJahr;
		return age;
	}

	static void isOld(int age) {
		String istAlt = "ist alt";
		String istNichtAlt = "ist nicht alt";

		if (age > 31) {
			System.out.println(istAlt);
		} else {
			System.out.println(istNichtAlt);
		}
	}

	public static void main(String[] args) {

		System.out.println(name + " ist zur Zeit " + age + " Jahre alt.");

	}

}