package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

	public static void main (String [] args) throws IOException {
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Wie groß bist Du in cm");

			String größe = reader.readLine();
			
			reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Wie schwer bist Du (in KG)");
			
			String gewicht = reader.readLine();
			
			float intGrösse = Float.parseFloat(größe);
			float intGewicht = Float.parseFloat(gewicht);
			float BMI = intGewicht / (intGrösse/100 * intGrösse/100);
			
			System.out.println("Der BMI ist " + BMI);
			
			if (BMI< 18.5) {System.out.println("Du hast Untergewicht.");}
			
			if (BMI>=18.5) {
				if (BMI<25) {System.out.println("Du hast Normalgewicht.");}};
				
			if (BMI>=25) {
					if (BMI<30) {System.out.println("Du hast Übergewicht.");}};
					
			if (BMI>= 30) {System.out.println("Du hast schweres Übergewicht.");}
	
	}

}
