package com.wcs.java.basics.exercises.w3c.Datumsrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Datumsrechner {
	static int jahr;
	static int monat;
	static int tag;
	static int stunden;
	static int minuten;
	static int additionMinuten;

	static int addMinutes;
	static int overflowHours;
	static int addHours;
	static int addDays;
	static int overflowDays;
	static int overflowMonths;

	static int minutenAnzeige;
	static int stundenAnzeige;
	static int tagAnzeige;
	static int monatAnzeige;
	static int jahrAnzeige;

	public static void main(String[] args) {
		berechnung();
		minutenConverter(additionMinuten);
		datumBerechnen();
	}

	public static void berechnung() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Gib das Jahr ein");
		jahr = userInput.nextInt();
		System.out.println("Gib den Monat ein");
		monat = userInput.nextInt();
		System.out.println("Gib den Tag ein");
		tag = userInput.nextInt();
		System.out.println("Gib die Stunden ein");
		stunden = userInput.nextInt();
		System.out.println("Gib die Minuten ein");
		minuten = userInput.nextInt();
		System.out.println("Wie viel Minuten sollen addiert werden?");
		additionMinuten = userInput.nextInt();
		System.out.println(jahr + " " + monat + " " + tag + " " + stunden + " " + minuten + " " + additionMinuten);

	}

	public static void minutenConverter(int additionMinuten) {
		addMinutes = additionMinuten % 60;
		overflowHours = additionMinuten / 60;
		addHours = overflowHours % 24;
		overflowDays = overflowHours / 24;
		addDays = overflowHours % 24;
		if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
			overflowMonths = overflowDays / 31;
			addDays = overflowDays % 31;
		}
		if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
			overflowMonths = overflowDays / 30;
			addDays = overflowDays % 30;
		}
		if (monat == 2) {
			overflowMonths = overflowDays / 28;
			addDays = overflowDays % 28;
		}
		System.out.println("Es sollen " + overflowMonths + " Monate " + addDays + " Tage " + addHours + " Stunden "
				+ addMinutes + " Minuten hinzugefügt werden.");
//		int[] zeitSummand = new int[4];
//		zeitSummand[0] = addMinutes;
//		zeitSummand[1] = addHours;
//		zeitSummand[2] = addDays;
//		zeitSummand[3] = overflowMonths;
//		return zeitSummand;
	}

	public static void datumBerechnen() {
		if ((minuten + addMinutes) > 59) {
			minutenAnzeige = minuten + addMinutes - 60;
			addHours = addHours + 1;
		}
		if ((minuten + addMinutes) == 60) {
			minutenAnzeige = 0;
			addHours = addHours + 1;
		}
		if ((minuten + addMinutes) < 60) {
			minutenAnzeige = minuten + addMinutes;

		}

		if ((stunden + addHours) > 23) {
			stundenAnzeige = stunden + addHours - 24;
			addDays = addDays + 1;
		}
		if ((stunden + addHours) == 24) {
			stundenAnzeige = 0;
			addHours = addHours + 1;
		}
		if ((stunden + addHours) < 24) {
			stundenAnzeige = stunden + addHours;
		}

		if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
//			overflowMonths = (tag + overflowDays) / 31;
//			addDays = overflowDays % 31;

			if ((tag + addDays) > 31) {
				tagAnzeige = tag + addDays - 31-1;
				overflowMonths = overflowMonths + 1;
			}
//			if ((tag + addDays) == 31) {
//				tagAnzeige = 1;
//				overflowMonths = overflowMonths + 1;
			}

			if ((tag + addDays) < 32) {
				tagAnzeige = tag + addDays;
			}
		
		if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
//			overflowMonths = (tag + overflowDays) / 30;
//			addDays = overflowDays % 30;

			if ((tag + addDays) > 30) {
				tagAnzeige = tag + addDays - 30-1;
				overflowMonths = overflowMonths + 1;
			}
//			if ((tag + addDays) == 30) {
//				tagAnzeige = 1;
//				overflowMonths = overflowMonths + 1;
//			}

			if ((tag + addDays) < 31) {
				tagAnzeige = tag + addDays;
			}

		}
		if (monat == 2) {
//			overflowMonths = (tag + overflowDays) / 28;
//			addDays = (tag + overflowDays) % 28;

			if ((tag + addDays) > 28) {
				tagAnzeige = tag + addDays - 28-1;
				overflowMonths = overflowMonths + 1;
			}
//			if ((tag + addDays) == 28) {
//				tagAnzeige = 1;
//				overflowMonths = overflowMonths + 1;
//			}

			if ((tag + addDays) < 29) {
				tagAnzeige = tag + addDays;
			}

		}
		if ((monat + overflowMonths) > 12) {
			jahr = jahr + 1;
			monatAnzeige = overflowMonths + monat - 12;
		}
//		if ((monat + overflowMonths) == 12) {
//			jahr = jahr + 1;
//		}
		if ((monat + overflowMonths) < 13)
			monatAnzeige = overflowMonths + monat;

		System.out.println(jahr + " Jahr " + monatAnzeige + " Monat " + tagAnzeige + " tag " + stundenAnzeige + " Stunde "
				+ minutenAnzeige + " Minute");
	}
}