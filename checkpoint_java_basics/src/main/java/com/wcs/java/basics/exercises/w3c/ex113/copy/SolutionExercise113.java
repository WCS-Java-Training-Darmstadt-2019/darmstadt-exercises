package com.wcs.java.basics.exercises.w3c.ex113.copy;

import java.util.Arrays;

public class SolutionExercise113 {

	
	int [] arrInt1;
	int [] arrInt2;
	int [] arrtotalLength;
	
	public SolutionExercise113() {
		
	}

	public SolutionExercise113(int[] arrInt1, int[] arrInt2, int[] arrtotalLength) {
		super();
		this.arrInt1 = arrInt1;
		this.arrInt2 = arrInt2;
		this.arrtotalLength = arrtotalLength;
	}



//	public int[] getArrInt1() {
//		return arrInt1;
//	}
//
//	public void setArrInt1(int[] arrInt1) {
//		this.arrInt1 = arrInt1;
//	}
//
//	public int[] getArrInt2() {
//		return arrInt2;
//	}
//
//	public void setArrInt2(int[] arrInt2) {
//		this.arrInt2 = arrInt2;
//	}

	public int[] getArrtotalLength() {
		return arrtotalLength;
	}

	public void setArrtotalLength(int[] arrtotalLength) {
		this.arrtotalLength = arrtotalLength;
	}

	public int[] concatAndSortArr(int[] arrInt1, int [] arrInt2) {
		
		//Array zusammenführen
		int[] arrtotalLength = new int[arrInt1.length + arrInt2.length]; 
		for (int i =0; i<arrInt1.length; i++) {
			arrtotalLength[i]=arrInt1[i];			
		}
		for (int i=0; i<arrInt2.length; i++) {
			arrtotalLength[arrInt1.length+i]=arrInt2[i];
		}
		
		Arrays.parallelSort(arrtotalLength);
		
		setArrtotalLength(arrtotalLength);
		return arrtotalLength;
		
	}
	
}



	
	
