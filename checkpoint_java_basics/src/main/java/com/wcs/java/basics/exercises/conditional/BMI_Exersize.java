package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI_Exersize {

	float bmi;

	public static void main(String[] args) throws IOException {
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Gib dein Gewicht in kg ein.");

		String eingabeGewicht = reader1.readLine();
		int gewicht = Integer.parseInt(eingabeGewicht);

		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Gib deine Grösse in m ein.");

		String eingabeGroesse = reader2.readLine();
		float groesse = Float.parseFloat(eingabeGroesse);

		float bmi = gewicht / (groesse * groesse);

		if (bmi < 18.5) {
			System.out.println("Ihr Body-Mass-Index beträgt " + bmi + ".");
			System.out.println("Du hast Untergewicht.");

		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Ihr Body-Mass-Index beträgt " + bmi + ".");
			System.out.println("Du hast Normalgewicht.");

		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Ihr Body-Mass-Index beträgt " + bmi + ".");
			System.out.println("Du hast Übergewicht.");

		} else if (bmi > 30) {
			System.out.println("Ihr Body-Mass-Index beträgt " + bmi + ".");
			System.out.println("Du hast schweres Übergewicht.");
		}

	}

}