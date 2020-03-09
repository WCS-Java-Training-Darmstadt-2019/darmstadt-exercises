package com.wcs.java.basics.exercises.strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wcs.java.basics.exercises.arrays.ArraysExercise;
import com.wcs.java.basics.exercises.arrays.Basic4_Array;

public class ArraysExerciseTest {
	
	@Test
	public void test() {
		String[] array = ArraysExercise.createArray("David",10);
		assertTrue(array.length == 10);
		
		for (int i=0;i<array.length;i++) {
			assertEquals(array[i], "David");
		}
		
	}

}
