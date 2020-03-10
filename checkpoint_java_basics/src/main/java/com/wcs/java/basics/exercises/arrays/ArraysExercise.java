package com.wcs.java.basics.exercises.arrays;

import java.util.Arrays;



public class ArraysExercise {
	
		
public static void main(String[] args) { 
	
		
	String[]array = createArray("David", 10);
	
	
	for (String s: array){
		System.out.println(s);				
		}


	char [][]array_2 = createGrid('x', 2, 10);
	
	
	for (int m = 0; m < array_2.length; m++) {
	      for(int n = 0; n < array_2[m].length; n++) {
	        System.out.println(array_2[m][n]);
	      }
	    }
	
}
	
public static String [] createArray (String name, int number) {
		
		String [] names = new String [number];
			
		for (int i = 0; i < names.length; i++){
			names [i] = name;
			System.out.println(Arrays.toString(names));
		}			
		return names;
		}


public static char [][] createGrid(char b, int row, int column) {
	
	
		char [][] grid = new char [row][column];
		
		for (int i=0; i<grid.length; i++) {
			for(int k=0; k <grid[i].length; k++) {
			grid [i][k] = b;
			
			}
		}
		return grid;
		
}
}

	
		
//	// erstelle eine methode die ein 2 dimensional;es array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.



//	
//	//grid = createGrid(2,10,"x");
//	
//	
//		
//	// iteriere über jede zelle des grids und gebe spalte und zeile aus sowie den inhalt
//		
//	
//	
//	// x:0,y=0,value=x
//	// x:1,y=0,value=x
//	// etc.
//	
//	// gebe es als einen string aus
//	// bsp = grid mit 10 spalten und 3 zeilen
//	// ---------------------
//	// |x|x|x|x|x|x|x|x|x|x|
//	// |x|x|x|x|x|x|x|x|x|x|
//	// |x|x|x|x|x|x|x|x|x|x|
//	// ---------------------
//	String gridAsString = gridAsString(grid);
//	System.out.println(gridAsString);
//	




