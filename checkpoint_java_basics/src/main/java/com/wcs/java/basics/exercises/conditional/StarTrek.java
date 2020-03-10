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
        
        if (filmNo > 2) {
        	System.out.println("Der Film ist gut");	
        	
        }else {
			while (filmNo < 2) {
        		String eingabe1 = reader.readLine();
                int filmNo1 = Integer.parseInt(eingabe1);
                System.out.println("Der Film ist schlecht, versuchen Sie nochmal");
        	}
      }
        System.out.println("FilmNo:" + filmNo);
	}
	
	// LEIDER KAM ICH NICHT WEITER WEIL EINE STUNDE RUM IST, 
	//ABER ICH GLAUBE HÄTTE ICH MEHR ZEIT; HÄTTE ICH ES HIN BEKOMMEN
        
       
}
