package com.wcs.java.basics.exercises.w3c.BonusAufgabe2;

public class Flugzeugtest {

	public static void main(String[] args) {
		Glider sf = new Glider("kleines Segelflugzeug", "D-4711", 17.0, 1);
		System.out.println(sf);
		PassengerPlane pg = new PassengerPlane("Motorflugzeug", "Cesna 172 P", 10.97, 4, 1.3);
		System.out.println(pg);
		A380 a380 = new A380("Jet", "A380", 79.80, 558, 1280);
		System.out.println(a380);
		System.out.println("The amount of planes is: " + Plane.amountPlane);
		System.out.println("The amoutn of gliders is: " + Glider.amountGlider);
		System.out.println("The amount of passengerplanes is: " + PassengerPlane.amountPassengerplane);
		System.out.println("The amount of A380 is: " + A380.amountA380);

	}
}