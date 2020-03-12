package com.wcs.java.basics.exercises.w3c.ex013;

public class SolutionExercise013 {
	float surface; 
	float perimeter;  
	
	public SolutionExercise013(float surface, float perimeter) {
	
		this.surface = surface;
		this.perimeter = perimeter;
	}
	
//	public float getSurface() {
//		return surface;
//	}
//
//	public void setSurface(float surface) {
//		this.surface = surface;
//	}
//
//	public float getPerimeter() {
//		return perimeter;
//	}
//
//	public void setPerimeter(float perimeter) {
//		this.perimeter = perimeter;
//	}
	
	
	public float calcPerimeter(float width, float heigth) {
		
		perimeter=2*width*heigth;
//		setPerimeter(perimeter); 
		
		return perimeter; 
	}
	
	public float calcSurface(float width, float heigth) {
	
		surface=width*heigth; 
//		setSurface(surface);
		return surface;
	}
	
}



	
	
