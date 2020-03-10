package com.wcs.java.basics.exercises.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	
	public static void main(String[] args) {
		
		// die methode createArray soll ein string array mit den angegeben werten anlegen
		
		String[] string_array = createArray("David", 10);
		
		// iteriere über das array und gebe jeden Wert in der console aus.
		for (int i=0; i<string_array.length; i++)
			System.out.println(string_array[i]);
		
		System.out.println();
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		String[][] grid = createGrid(2,10,"x");
		
		// iteriere über jede zelle des grids und gebe spalte und zeile aus sowie den inhalt
		// x:0,y=0,value=x
		// x:1,y=0,value=x
		// etc.
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				System.out.println("x:" + i + ",y:" + j + ",value:" + grid[i][j]);
			}
		}
		
		// gebe es als einen string aus
		// bsp = grid mit 10 spalten und 3 zeilen
		// ---------------------
		// |x|x|x|x|x|x|x|x|x|x|
		// |x|x|x|x|x|x|x|x|x|x|
		// |x|x|x|x|x|x|x|x|x|x|
		// ---------------------
		String gridAsString = gridAsString(grid);
		System.out.println();
		System.out.println(gridAsString);
		
		int[] primes = sieveErathostenes(30);
		for (int i=0; i<primes.length; i++)
			System.out.println(primes[i]);
		
	}

	private static String gridAsString(String[][] grid) {
		
		StringBuilder result = new StringBuilder();
		
		for (int j = 0; j < grid.length * 2 + 1; j++)
			result.append("-");
		
		result.append("\n");
		
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				if (j == 0) { //
					result.append("|"); // first column only
				}
				result.append(grid[i][j]);
				result.append("|");
			}
			result.append("\n");
		}	
		
		for (int j = 0; j < grid.length * 2 + 1; j++)
			result.append("-");
		
		result.append("\n");
	
		
		
		return result.toString();
	}

	private static String[][] createGrid(int x, int y, String string) {

		String[][] grid = new String[x][y];
		
		for (int i=0; i<x; i++)
			for (int j=0; j<y; j++)
				grid[i][j] = string;
		
		return grid;
	}

	private static String[] createArray(String string, int size) {
		
		String[] result = new String[size];
		
		for (int i=0; i<size; i++) {
			result[i]=string;
		}
		return result;
	}
	
	 private static int[] sieveErathostenes (int limit) {
		 
		 Set<Integer> numbers = new HashSet<Integer>();
		 
		 for (int i=2; i<=limit; i++)
			 numbers.add(i);
		 
		 for (int i = 2; i <= Math.sqrt(limit); i++) {
			 for (int j = i * i; j <= limit; j += i) {
				 numbers.remove(j);
			 }
		 }
		 
		 Object[] resultObj = numbers.toArray();
		 int[] result = new int[resultObj.length]; 
		 for (int i=0; i<numbers.size(); i++) {
			 result[i]=(int) resultObj[i];
		 }
		 
		 return result;
		 
	 }

}
