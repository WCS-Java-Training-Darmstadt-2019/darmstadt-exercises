package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTrek {
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Welchen Teil von StarTrek möchten sie anschauen? Bitte geben sie die Nr ein.");
        
        String eingabe = reader.readLine();
        int filmNo = Integer.parseInt(eingabe);
        
        System.out.println ("FilmNo: " + filmNo); 
        
        if (filmNo %2==0) {
        	System.out.println ("Gute Wahl - Film unbedingt anschauen!"); 
        }else {
        	System.out.println ("Film besser nicht anschauen!"); 
        }
                 		
	}
	
}
	
	
	