package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTrek {
	
	public static void main(String[] args) throws IOException {
        
		for(int i=0;i<10;i++) {
		BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Welchen Teil von Startrek möchten sie schauen? Bitte geben sie die Nr ein.");
        
        String eingabe = reader.readLine();
        int filmNo = Integer.parseInt(eingabe);//TODO;
       
        
        
        if(filmNo==1 || filmNo==3 || filmNo == 5 || filmNo ==7) {

        	System.out.println("FilmNo:" + filmNo);
        	System.out.println(" " +"Ich würde den Film nicht empfehlen");  
        	}
           	else if (filmNo==2) {
           		System.out.println("Der Zorn des Khan");
           		break;
        	}
           	else if (filmNo==4) {
           		System.out.println("Zurück in die Gegenwart");
           		break;
        	}
           	else if (filmNo==6) {
           		System.out.println("ZDas unentdeckte Land");
           		break;
        	}
           	else if (filmNo==8) {
           		System.out.println("Der erste Kontakt");
           		break;
        	}
		}
        	
	}
}
        
        


