package com.wcs.java.basics.exercises.w3c.BonusAufgabe2;

public class Glider extends Plane {

	static int amountGlider;

	public Glider(String planetype, String planeId, double spread, int seats) {
		super(planetype, planeId, spread, seats);
		amountGlider++;
	}

	public String toString() {
		return "Glider " + planeId + " of the planetype " + planetype + " has a wingspread of "
				+ Double.toString(spread) + "m and a capacity of " + seats;
	}

}