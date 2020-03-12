package com.wcs.java.basics.exercises.w3c.ex013;

public class SolutionExcercise013main {

	public static void main(String[] args) {
		
		SolutionExercise013 rectangel= new SolutionExercise013(0, 0); 
		
		float width = (float) 5.6;
		float height= (float) 8.5;

		System.out.println("The perimeter of this rectangle is: " + rectangel.calcPerimeter(width, height));
		System.out.println("The surface of this rectangle is: " + rectangel.calcSurface(width, height));
	}

}