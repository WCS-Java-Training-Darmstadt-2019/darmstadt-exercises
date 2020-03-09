package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Bitte geben Sie ihre Größe in cm ein!");
        
        String eingabe1 = reader.readLine();
        double height = Double.parseDouble(eingabe1);
               
        System.out.println("Bitte geben Sie ihre Gewicht in Kilogramm ein!");
        
        String eingabe2 = reader.readLine();
        double weight = Double.parseDouble(eingabe2);
        
        double bmi = weight/(height/100*height/100);
        
        
        if (bmi <=18.5) {
        	System.out.println ("Untergewicht");}
        
        if (bmi>18.5 && bmi<=25) {
        	System.out.println ("Normalgewicht");}
        	
        if (bmi>25 && bmi<=30) {
        	System.out.println ("Übergewicht");}
        if (bmi>30) { 
        System.out.println ("schweres Übergewicht"); 
        }
 	}
}

