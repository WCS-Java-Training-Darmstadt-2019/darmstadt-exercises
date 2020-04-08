package com.wcs.java.basics.exercises.w3c.BonusAufgabe3;

public class Parabel extends Function {

	double a;
	double b;
	double c;

	public Parabel(double x, double a, double b, double c) {
		super(x);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public double map(double x) {
		y = a * x * x + 2 * x * b + c;
		return y;

	}

	public void toString(double y) {

		System.out.println(Double.toString(y));
	}
}
