package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		double length;
		double weight;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Zur Berechnung ihres BMI benötigen wir Größe und Gewicht.\nBitte geben Sie Ihre Größe in m ein mit einer Stelle nach dem Komma!");
		 
		 length = Double.parseDouble(reader.readLine());
		 
		 System.out.println("Bitte geben Sie Ihr Gewicht mit einer Stelle nach dem Komma ein!");
		 
		 weight = Double.parseDouble(reader.readLine());
		 
		 double bmi = weight / (length * length);
		 
		 if(bmi > 30) {
			 System.out.println("Sie haben schweres Übergewicht");
		 }else if(bmi < 18.5) {
			 System.out.println("Sie haben Untergewicht");
		 }else if(bmi<26) {
			 System.out.println("Sie haben Normalgewicht");
		 }else {
			 System.out.println("Sie haben Übergewicht");
		 }	 
	}

}
