package com.wcs.java.basics.exercises.w3c.BonusAufgabe2;

public class A380 extends PassengerPlane {

	static int amountA380;
	
	public A380(String planetype, String planeId, double spread, int seats, double power) {
		super(planetype, planeId, spread, seats, power);
		amountA380++;
	}

}
