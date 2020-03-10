package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Bitte geben sie ihre Körpergröße in cm ein:");
        
        String eingabe = reader.readLine();
        double groesse = Double.parseDouble(eingabe);
        
        System.out.println("Bitte geben sie ihr Gewicht in Kilogramm ein (Punkt als Dezimalzeichen):");//TODO;
        eingabe = reader.readLine();
        double gewicht  = Double.parseDouble(eingabe);
        
        double bmi = gewicht/((groesse/100)*(groesse/100));
        
        //System.out.println("Ihr Gewicht ist " + gewicht);
        //System.out.println("Ihre Groesse ist " + groesse);
        System.out.println("Ihr BMI ist " + bmi);
        
        if (bmi < 18.5 ) {
        	System.out.println("Sie haben Untergewicht.");
        } else if (bmi <= 25) { 
        	System.out.println("Sie haben Normalgewicht.");
        } else if (bmi <= 30) { 
        	System.out.println("Sie haben Übergewicht.");
        } else {
        	System.out.println("Sie haben schweres Übergewicht.");
        }
	}
	
	
        
        

}
