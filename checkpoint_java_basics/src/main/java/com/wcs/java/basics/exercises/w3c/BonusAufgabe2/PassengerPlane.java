package com.wcs.java.basics.exercises.w3c.BonusAufgabe2;

public class PassengerPlane extends Plane{
	
	static int amountPassengerplane;
	
	
	double power;

	public PassengerPlane(String planetype, String planeId, double spread, int seats, double power) {
		super(planetype, planeId, spread, seats);
		this.power = power;
		amountPassengerplane++;
	}

	public double getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}
	
	public String toString() {
		return "Passentgerplane " + planeId + " of the planetype " + planetype + " has a wingspread of " + Double.toString(spread) + "m and a capacity of " + seats +" while the Motor has a power of " + power;
	}
	
}
