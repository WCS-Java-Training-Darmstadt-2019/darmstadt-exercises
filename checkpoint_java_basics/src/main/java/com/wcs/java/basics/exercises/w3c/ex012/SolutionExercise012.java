package com.wcs.java.basics.exercises.w3c.ex012;

public class SolutionExercise012 {
 
//	int ersterWert = 1;
//	int zweiterWert = 2;
//	int dritterWert = 3;
//	
	
	int result;
	
	public SolutionExercise012(int result) {
		this.result = result;
	}

	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}
	
	
	public int averageOf3 (int a, int b, int c) {
		
	result = (a+b+c)/3;
	setResult(result);
	return result;
	}
	
}



	
	
