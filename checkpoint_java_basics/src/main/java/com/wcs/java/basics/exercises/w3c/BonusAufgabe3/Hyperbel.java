package com.wcs.java.basics.exercises.w3c.BonusAufgabe3;

public class Hyperbel extends Function {

	double a;

	public Hyperbel(double x, double a) {
		super(x);
		this.a = a;
	}

	@Override
	public double map(double x) {
		y = this.a * x;
		return y;
	}
}
