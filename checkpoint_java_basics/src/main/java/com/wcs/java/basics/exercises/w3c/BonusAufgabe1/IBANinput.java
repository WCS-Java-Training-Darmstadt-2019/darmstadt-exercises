package com.wcs.java.basics.exercises.w3c.BonusAufgabe1;

public class IBANinput {
	public String länderKennung;
	public String kontoNummer;
	public String bankLeitZahl;

	public IBANinput(String länderKennung, String kontoNummer, String bankLeitZahl) {
		this.länderKennung = länderKennung;
		this.kontoNummer = kontoNummer;
		this.bankLeitZahl = bankLeitZahl;
	}
}