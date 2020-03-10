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
        
        System.out.println("FilmNo:" + filmNo);
        
        if(filmNo%2 == 0) { 
        	System.out.println("Wir wünschen Ihnen viel Spass bei dem Film!");
        }else {
        	System.out.println("Lust auf ein Bier? https://www.werkenntdenbesten.de/kneipe/mainz Besuchen Sie doch mal eine davon ..... JETZT!!");
        }
        
	}
	   
}
