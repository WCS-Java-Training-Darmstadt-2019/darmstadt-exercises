package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Wie groß sind Sie? Die Angabe bitte in cm.");

		String eingabe = reader.readLine();
		float groeße = Float.parseFloat(eingabe);
		groeße = groeße / 100;

		System.out.println("Wieviel wiegen Sie?");

		String eingabe2 = reader.readLine();
		float gewicht = Float.parseFloat(eingabe2);

		float bmi = gewicht / (groeße * groeße);
		System.out.println(bmi);

		if (bmi < 18.5) {
			System.out.println("Untergewicht");
		}
		if (bmi > 18.5 && bmi < 25) {
			System.out.println("Normalgewicht");
		}
		if (bmi > 25 && bmi < 30) {
			System.out.println("Uebergewicht");
		}
		if (bmi > 30.0) {
			System.out.println("schweres Uebergewicht");
		}

	}
}
