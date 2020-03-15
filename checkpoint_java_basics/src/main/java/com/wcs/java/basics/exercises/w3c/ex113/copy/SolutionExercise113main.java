package com.wcs.java.basics.exercises.w3c.ex113.copy;

public class SolutionExercise113main {

	public static void main(String[] args) {

		int[] dictionary1 = { 2, 5, 7, 1, 2, 6, 55, 0 };

		int[] dictionary2 = { 1223, 11, 13, 9, 6, 1, 2 };

		int[] result = new int[dictionary1.length + dictionary2.length];
		
		SolutionExercise113 SortedArr = new SolutionExercise113(dictionary1, dictionary2, result);

		SortedArr.concatAndSortArr(dictionary1, dictionary2);

		for (int i = 0; i < dictionary1.length + dictionary2.length; i++) {
			System.out.println(SortedArr.getArrtotalLength().[i]);
		}
	}
}