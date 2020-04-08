package com.wcs.java.basics.exercises.w3c.IBANRechner_Denis;

import java.util.Scanner;

public class IbanBerechnen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Ländercode ein z.B DE: ");
		String LC = sc.next();
		System.out.println("Bitte geben Sie Ihre gewünschte achtstellige BLZ ein: ");
		String BLZ = sc.next();
		System.out.println("Bitte geben Sie Ihre gewünschte zehnstellige Kontonummer ein: ");
		String KN = sc.next();
		sc.close();
		Funktion.erzeugeIban(LC, BLZ, KN);
	}
}
