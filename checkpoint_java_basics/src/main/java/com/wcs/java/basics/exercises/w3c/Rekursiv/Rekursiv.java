package com.wcs.java.basics.exercises.w3c.Rekursiv;

import java.util.Scanner;

public class Rekursiv {

	static double basis;
	static int potenz;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben Sie die Basis ein.");

		basis = sc.nextDouble();

		System.out.println("Bitte geben Sie die Potenz ein.");

		potenz = sc.nextInt();

		potenzrechner(basis, potenz);
	
		System.out.println("Ergebnis: " + hilfsvariable);
	}

	static double hilfsvariable = 1;
	static int zaehler = 0;

	public static void potenzrechner(double basis, int potenz) {

		hilfsvariable = hilfsvariable * basis;
		zaehler++;
		if (zaehler < potenz) {
			potenzrechner(basis, potenz);
		}
		
	}

}
