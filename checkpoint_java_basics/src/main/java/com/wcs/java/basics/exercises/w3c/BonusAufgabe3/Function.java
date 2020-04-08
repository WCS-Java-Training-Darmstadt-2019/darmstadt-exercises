package com.wcs.java.basics.exercises.w3c.BonusAufgabe3;

public abstract class Function {

	private double x;
	public double y;

	public Function(double x) {
		super();
		this.x = x;

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public abstract double map(double x);
}
