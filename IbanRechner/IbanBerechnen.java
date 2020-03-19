import java.util.Scanner;

public class IbanBerechnen {

	public static void main(String[] args) {
		
		KontoInhaber kunde = new KontoInhaber();
		userEingaben(kunde);

		System.out.println("Ihre IBAN lautet: "+createIban(kunde.getLaenderCode(), kunde.getBlz(), kunde.getKontoNummer()));

	}

	private static void userEingaben(KontoInhaber kunde) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hiermit berechnen wir Ihre IBAN.\nGeben Sie zuerst bitte Ihren Ländercode ein:");
		kunde.setLaenderCode(sc.next().toUpperCase());

		System.out.println("Geben Sie nun bitte Ihre Kontonummer ein:");
		kunde.setKontoNummer(sc.next());
		kunde.setKontoNummer(normalizeKtoNr(kunde.getKontoNummer()));

		System.out.println("Geben Sie zuletzt Ihre Bankleitzahl ein:");
		kunde.setBlz(sc.next());
		sc.close();

	}

	public static String createIban(String laenderkennung, String blz, String kontoNummer) {
		String BBAN;
		String BBANAndDeCode;
		final int MODULOKONSTANTE = 98;
		String pruefzahl;

		BBAN = createBBAN(blz, kontoNummer);

		BBANAndDeCode = BBAN + changeLCodeToNumbers(laenderkennung + "00");

		pruefzahl = Integer.toString(berechnePruefzahl(calculateModulo(BBANAndDeCode), MODULOKONSTANTE));

		return (laenderkennung + pruefzahl + BBAN);
	}

	public static String normalizeKtoNr(String kontoNummer) {

		String zeroes = "";

		for (int i = kontoNummer.length(); i < 10; i++) {
			zeroes += "0";
		}
		kontoNummer = zeroes + kontoNummer;
		return kontoNummer;
	}

	public static String createBBAN(String blz, String kontoNummer) {

		return blz + kontoNummer;

	}

	public static String changeLCodeToNumbers(String LCode) {

		int decimal;
		LCode = LCode.toLowerCase();
		String decimalAsString = "";

		for (int i = 0; i < LCode.length(); i++) {
			String s = Character.toString(LCode.charAt(i));
			decimal = Integer.parseInt(s, 16);
			decimalAsString += Integer.toString(decimal);
		}

		return decimalAsString;
	}

	public static int calculateModulo(String BBAN) {

		int subNumber;
		String newBBAN = BBAN;

		while (newBBAN.length() >= 9) {

			subNumber = Integer.parseInt(newBBAN.substring(0, 9));
			subNumber = subNumber % 97;
			newBBAN = Integer.toString(subNumber) + newBBAN.substring(9);
		}
		if (newBBAN.length() < 9) {
			subNumber = Integer.parseInt(newBBAN.substring(0));
			subNumber = subNumber % 97;
			newBBAN = Integer.toString(subNumber);
		}

		return Integer.parseInt(newBBAN);
	}

	public static int berechnePruefzahl(int moduloResult, int konstante) {

		return konstante - moduloResult;
	}

}
