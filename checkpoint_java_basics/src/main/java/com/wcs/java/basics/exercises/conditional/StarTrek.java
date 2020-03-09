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
        int filmNo = Integer.parseInt(eingabe);//TODO;
        
        if (filmNo % 2 == 0) {
        	System.out.println("Film Nummer " + filmNo + " ist eine gute Wahl. Viel Spass beim gucken.");       
        		
        	} else {
        		
        	System.out.println("Film Nummer " + filmNo + " ist keine gute Wahl. Verschwende deine Zeit nicht und guck lieber was anderes.");
        	}
	       
        }
}
