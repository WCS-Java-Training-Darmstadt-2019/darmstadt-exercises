package com.wcs.java.basics.exercises.arrays;

import com.sun.tools.javac.util.ArrayUtils;


/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	


	
	public static void main(String[] args) {
		
		// die methode createArray soll ein string array mit den angegeben werten anlegen
		
		
		String [] names = new String [10];
						
		// iteriere über das array und gebe jeden Wert in der console aus.

		for (String s: names){
		System.out.println(s);				
		}
		

	
		// erstelle eine methode die ein 2 dimensional;es array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		int [][] grid  = new int [2][10];
		
		//grid = createGrid(2,10,"x");
		
		
			
		// iteriere über jede zelle des grids und gebe spalte und zeile aus sowie den inhalt
			
		for (int i=0; i<grid.length; i++) {
			for(int k=0; k <grid[i].length; k++) {
				System.out.println(grid[i][k]);
				
			}
		}
		
		// x:0,y=0,value=x
		// x:1,y=0,value=x
		// etc.
		
		// gebe es als einen string aus
		// bsp = grid mit 10 spalten und 3 zeilen
		// ---------------------
		// |x|x|x|x|x|x|x|x|x|x|
		// |x|x|x|x|x|x|x|x|x|x|
		// |x|x|x|x|x|x|x|x|x|x|
		// ---------------------
		String gridAsString = gridAsString(grid);
		System.out.println(gridAsString);
		
	}
	
	

}
