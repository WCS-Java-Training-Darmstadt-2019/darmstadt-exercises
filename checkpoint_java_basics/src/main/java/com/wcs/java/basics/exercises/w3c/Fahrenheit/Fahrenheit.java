package com.wcs.java.basics.exercises.w3c.Fahrenheit;

public class Fahrenheit {

	public static void main (String [] args) {
		
		double fahrenheit = Double.parseDouble(args[0]);
		double celsius;
		
		celsius=(fahrenheit-32)*5/9;
		
		System.out.println(fahrenheit + " Grad in Fahrenheit sind " + celsius + " Grad Celsius.");
		
	}
	
}
