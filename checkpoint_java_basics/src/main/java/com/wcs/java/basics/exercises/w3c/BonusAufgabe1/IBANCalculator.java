package com.wcs.java.basics.exercises.w3c.BonusAufgabe1;

public class IBANCalculator {

	private static final int ITERATIVECUTSOF9 = 3;
	private String pruefziffer;

	public String generateIBAN(IBANinput data) {
		String x1 = data.länderKennung.toUpperCase();
		Integer x11 = 131400;
		String x12 = x11.toString();

		String x2 = data.bankLeitZahl;
		String x3 = data.kontoNummer;
		Integer x31 = 0;
		String x32 = x31.toString();

		while (x3.length() < 10) {
			x3 = x32.concat(x3);
		}

		String bBAN = x2.concat(x3);
		String zweitKombi = bBAN.concat(x12);

//		System.out.println(zweitKombi);

		for (int i = 0; i < ITERATIVECUTSOF9; i++) {

			String modulo97String = zweitKombi.substring(0, 9);
			Integer modulo97 = Integer.parseInt(zweitKombi.substring(0, 9)) % 97;
			modulo97String = modulo97.toString();

			zweitKombi = zweitKombi.substring(9);

			zweitKombi = modulo97String.concat(zweitKombi);

		}
		Integer modulo97 = Integer.parseInt(zweitKombi) % 97;

		modulo97 = Integer.parseInt(zweitKombi) % 97;
		Integer x = 98 - modulo97;
		if (x.toString().length() == 0) {
			pruefziffer = "00";
		}
		if (x.toString().length() == 1) {
			String zero = "0";
			pruefziffer = zero.concat(x.toString());
		}
		if (x.toString().length() == 2) {
			pruefziffer = x.toString();
		}

		String iBAN = x1.concat(pruefziffer).concat(bBAN);

		return "\nDeine IBAN lautet: \n" + iBAN;

	}
}