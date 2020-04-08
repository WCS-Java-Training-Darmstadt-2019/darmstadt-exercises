package com.wcs.java.basics.exercises.w3c.IBANRechner_Denis;

public class Funktion {

		public static void erzeugeIban(String LC, String BLZ, String KN) {
			while (KN.length() < 10) { // 10 Stellen für KN Prüfen
				KN = "0" + KN;
			}
			System.out.println("Ihre Kontonummer lautet: " + KN);
			String BBAN = BLZ + KN; // BBAN Erzeugung
			System.out.println("Ihre BBAN lautet       : " + BBAN);
			char first = LC.charAt(0); // Einzeln auslesen von Ländercode
			char second = LC.charAt(1);
			String firstLC = String.valueOf(first).toUpperCase(); // Char to String umwandlung
			String secondLC = String.valueOf(second).toUpperCase();
			Integer hexLC = Integer.parseInt(firstLC, 16); // Hex to Dec umwandlung
			System.out.println("Ihre erste LC ist      : " + hexLC);
			Integer hexLC2 = Integer.parseInt(secondLC, 16);
			System.out.println("Ihre zweite LC ist     : " + hexLC2);
			String BBANResult = BBAN + "" + hexLC + "" + hexLC2 + "00"; //so lange 1 string vorkommt, kein addition
			System.out.println("Ihre BBAN Ergebnis ist : " + BBANResult);
			int maxChars = 9;
			String output;
			int output2;
			int pruefziffer;
			while (BBANResult.length() > 9) { // guckt ob länge vom string länger als 9
				output = BBANResult.substring(0, maxChars); // liest die ersten 9 Zeichnen des Strings BBAN
				int firstNine = Integer.parseInt(output); // Umwandelt die erst 9 String Zeichen in Integer
				output2 = firstNine % 97; // Modulo berechnung
				BBANResult = output2 + BBANResult.substring(9, BBANResult.length());
				if (BBANResult.length() < 9) {
					pruefziffer = output2 * 10;
					pruefziffer = pruefziffer % 97;
					pruefziffer = 98 - pruefziffer;
					if (pruefziffer < 10) {
						pruefziffer = pruefziffer * 10;
					} else {
						System.out.println("PZ ist                 : " + pruefziffer);
						System.out.println("Your Official Iban Is  : " + firstLC + secondLC + pruefziffer + BBAN);
					}
				}
			}
		}

}
