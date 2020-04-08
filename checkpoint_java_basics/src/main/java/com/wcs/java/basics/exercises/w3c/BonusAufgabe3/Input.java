package com.wcs.java.basics.exercises.w3c.BonusAufgabe3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public void input() throws IOException {

		System.out.println("Bitte geben Sie ein, was Sie berechnen möchten - Parabel oder Hyperbel");

		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

		String kurvenArt = reader1.readLine();

		if (kurvenArt.equals("Parabel")) {
			System.out.println("Bitte geben Sie die erste Konstante a für zur Lösung der Gleichung y=ax²+2bx+c ein.");
			BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
			String ff = reader1.readLine();
			System.out.println("Bitte geben Sie die zweite Konstante b für zur Lösung der Gleichung y=ax²+2bx+c ein.");
			BufferedReader g = new BufferedReader(new InputStreamReader(System.in));
			String gg = reader1.readLine();
			System.out.println("Bitte geben Sie die dritte Konstante c für zur Lösung der Gleichung y=ax²+2bx+c ein.");
			BufferedReader h = new BufferedReader(new InputStreamReader(System.in));
			String hh = reader1.readLine();
			System.out.println("Für welchen Bereich sollen die Werte berechnet werden z.B. von -10 bis 12 - bitte den unteren Wert angeben");
			BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
			String ii = reader1.readLine();
			System.out.println("Bitte den oberen Wert angeben");
			BufferedReader j = new BufferedReader(new InputStreamReader(System.in));
			String jj = reader1.readLine();

			Parabel parabel = new Parabel(Double.parseDouble(ii), Double.parseDouble(ff), Double.parseDouble(gg),
					Double.parseDouble(hh));

			System.out.println("Die Ergebnispaare lauten:");
			for (double i2 = Double.parseDouble(ii); i2 < Double.parseDouble(jj); i2=i2+0.1) {
				double y = parabel.map((double) i2);

				System.out.println(Double.toString(i2) + ", " + Double.toString(y));
			}


		} else {
		}

	}
}
