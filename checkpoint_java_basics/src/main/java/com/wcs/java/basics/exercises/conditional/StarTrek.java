package com.wcs.java.basics.exercises.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTrek {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welchen Teil von Startrek möchten sie schauen? Bitte geben sie die Nr ein.");

		String eingabe = reader.readLine();
		int filmNo = Integer.valueOf(eingabe);// das musste ich nachschauen.
		if (filmNo % 2 == 0) {
			System.out.println("gute Wahl, anschauen");
		} else {
			System.out.println("besser nicht anschauen");
		}

=======
        BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
 
        System.out.println("Welchen Teil von Startrek möchten sie schauen? Bitte geben sie die Nr ein.");
        
        String eingabe = reader.readLine();
        int filmNo = Integer.parseInt(eingabe);//TODO;
        
        System.out.println("FilmNo:" + filmNo);
>>>>>>> master
	}

}


