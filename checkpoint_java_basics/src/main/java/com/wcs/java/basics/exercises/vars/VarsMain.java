package com.wcs.java.basics.exercises.vars;

public class VarsMain {

	public static void main(String[] args) {
		String name = "David";
		int geburtsJahr = 1916;
		int age = calculateAge(geburtsJahr);
		boolean alt = istOld(age);

		System.out.println(name + " ist " + age + " alt.");
		if (alt == true) {
			System.out.println(name + " ist alt.");
		} else {
			System.out.println(name + " ist jung.");
		}

	}

	private static int calculateAge(int geburtsJahr) {
		int alter = 2020 - geburtsJahr;

		return alter;

	}

	private static boolean istOld(int age) {
		if (age >= 60) {
			return (true);
		} else {
			return (false);
		}
	}

}