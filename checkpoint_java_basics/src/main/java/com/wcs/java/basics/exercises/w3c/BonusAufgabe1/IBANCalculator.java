package com.wcs.java.basics.exercises.w3c.BonusAufgabe1;

public class IBANCalculator {

	ContactPoint contactPoint1 = new ContactPoint(); //, , getKontoNummer());

	public void generateIBAN() {

		String x1 = contactPoint1.länderKennung.toUpperCase();
		Integer x11 = 131400;
		String x12 = x11.toString();

		String x2 = contactPoint1.bankLeitZahl;
		String x3 = contactPoint1.kontoNummer;
		Integer x31 = 0;
		String x32 = x31.toString();

		while (x3.length() < 10) {
			x3 = x32.concat(x3);
		}

		String erstKombi = x2.concat(x3);
		String zweitKombi = erstKombi.concat(x12);

		System.out.println(zweitKombi);

	}
}
