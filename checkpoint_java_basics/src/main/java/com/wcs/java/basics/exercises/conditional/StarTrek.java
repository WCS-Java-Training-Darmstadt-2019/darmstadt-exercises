package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTrek {
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Welchen Teil von Startrek möchten sie schauen? Bitte geben sie die Nr ein.");
        
        String eingabe = reader.readLine();
        int filmNo = Integer.parseInt(eingabe);
        
        if (filmNo % 2 == 1 || filmNo == 10) {
        	System.out.println("Besser nicht!");
        } else
        {
        	System.out.println("Ja bitte!");
        }
        
        
	}
	
	
        
        

}
