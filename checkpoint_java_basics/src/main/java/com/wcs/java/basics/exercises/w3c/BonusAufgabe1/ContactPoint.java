package com.wcs.java.basics.exercises.w3c.BonusAufgabe1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContactPoint {
 
	String länderKennung;
	String kontoNummer;
	String bankLeitZahl;
	
	public ContactPoint(String länderKennung, String kontoNummer, String bankLeitZahl) {
		super();
		this.länderKennung = länderKennung;
		this.kontoNummer = kontoNummer;
		this.bankLeitZahl = bankLeitZahl;
	}

	public ContactPoint() {};
	
	
	public String getLänderKennung() {
		return länderKennung;
	}

	public void setLänderKennung(String länderKennung) {
		this.länderKennung = länderKennung;
	}

	public String getKontoNummer() {
		return kontoNummer;
	}

	public void setKontoNummer(String kontoNummer) {
		this.kontoNummer = kontoNummer;
	}

	public String getBankLeitZahl() {
		return bankLeitZahl;
	}

	public void setBankLeitZahl(String bankLeitZahl) {
		this.bankLeitZahl = bankLeitZahl;
	}


	public void eingaben () throws IOException {
	
	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Bitte gib Deine Länderkennung ein - für Deutschland DE.");

	länderKennung = reader1.readLine();
	
	BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Bitte gib Deine Kontonummer ein - bitte maximal die letzten 10 Ziffern.");

	kontoNummer = reader2.readLine();
	
	BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Bitte gib Deine BankLeitZahl ein.");

	bankLeitZahl = reader3.readLine();
	
	

	}

	public void callGenerateIBAN() {
	
	ContactPoint contactPoint = new ContactPoint(länderKennung, kontoNummer, bankLeitZahl);
	
	}
}




	
	
