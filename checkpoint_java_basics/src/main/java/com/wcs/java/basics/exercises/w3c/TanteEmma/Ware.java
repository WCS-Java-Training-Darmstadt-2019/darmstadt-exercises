package com.wcs.java.basics.exercises.w3c.TanteEmma;

import java.util.Scanner;

public class Ware {

	String name;
	double price;
	double tax;
	int amount;

	public Ware(String name, double price, double tax, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.amount = amount;
	}

	public Ware(String name, double price, double tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Ware() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void rechnung() {

		System.out.println("Gekaufter Artikel: " + this.getName() + "; Anzahl: " + this.getAmount());
		System.out.println("Netto ohne Mwst: " + (this.getPrice() * this.getAmount()
				- (this.getTax() * this.getAmount() * this.getPrice())));
		System.out.println("Mwst: " + (this.getPrice() * this.getAmount()) * (this.getTax()));
		System.out.println("Zu bezahlen: " + (this.getPrice() * this.getAmount()));

	}

}
