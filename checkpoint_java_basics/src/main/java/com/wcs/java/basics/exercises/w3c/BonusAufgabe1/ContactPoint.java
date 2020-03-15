package com.wcs.java.basics.exercises.w3c.BonusAufgabe1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ContactPoint ist zuständig für Erfassung der Eingaben und Ausgabe der IBAN
 * auf der Konsole.
 * 
 * @author sea29
 *
 */
public class ContactPoint {

	IBANinput data = null;

	public ContactPoint() {
	};

	public void eingaben() throws IOException {

		String länderKennung = null;

		boolean istRichtig = false;

		while (istRichtig == false) {

			System.out.println("Bitte gib Deine Länderkennung ein - für Deutschland DE.");

			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

			länderKennung = reader1.readLine();

			if (länderKennung.length() > 2) {
				System.out.println("Die Länderkennung entspricht nicht den Vorgaben, bitte noch einmal eingeben!");

			} else {

				System.out.println("Danke, die eingegebene Länderkennung ist: " + länderKennung);
				System.out.println();
				istRichtig = true;

			}
		}

		String kontoNummer = null;

		istRichtig = false;

		while (istRichtig == false) {

			System.out.println("Bitte gib Deine Kontonummer ein - bitte maximal die letzten 10 Ziffern.");

			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

			kontoNummer = reader1.readLine();

			if (kontoNummer.length() > 10) {
				System.out.println("Die Kontonummer entspricht nicht den Vorgaben, bitte noch einmal eingeben!");

				if (kontoNummer.length() < 10) {
					while (kontoNummer.length() < 10) {
						String zero = "0";
						zero.concat(kontoNummer);
					}
				}

			} else {
				System.out.println("Danke, die eingegebene Kontonummer ist: " + kontoNummer);
				System.out.println();
				istRichtig = true;

			}

		}

		String bankLeitZahl = null;

		istRichtig = false;

		while (istRichtig == false) {

			System.out.println("Bitte gib Deine BankLeitZahl ein.");

			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

			bankLeitZahl = reader1.readLine();

			if (bankLeitZahl.length() > 8 || bankLeitZahl.length() < 8) {

				System.out.println("Die Bankleitzahl entspricht nicht den Vorgaben, bitte ncoh einmal eingeben!");

			} else {
				System.out.println("Danke, die eingegebene Bankleitzahl ist: " + bankLeitZahl);
				System.out.println();
				istRichtig = true;
			}
		}

		this.data = new IBANinput(länderKennung, kontoNummer, bankLeitZahl);
	}

	public void iBANberechnen() {
		IBANCalculator iBANCalculator = new IBANCalculator();
		String iBAN = iBANCalculator.generateIBAN(data);
		System.out.println(iBAN);
	}

}
