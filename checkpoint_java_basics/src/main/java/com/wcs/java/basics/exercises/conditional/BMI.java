package com.wcs.java.basics.exercises.conditional;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight = Integer.parseInt(args[0]);
		float height = Float.parseFloat(args[1]) / 100;
		String type = "";

		float bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			type = "Untergewicht";
		} else if (bmi < 25) {
			type = "Normalgewicht";
		} else if (bmi < 30) {
			type = "Übergewicht";
		} else {
			type = "schweres Übergewicht";
		}
		
		System.out.println(type);
	}

}
