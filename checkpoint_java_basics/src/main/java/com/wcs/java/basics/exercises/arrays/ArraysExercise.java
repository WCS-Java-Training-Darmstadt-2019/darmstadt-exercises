package com.wcs.java.basics.exercises.arrays;


/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	
	
	public static void main(String[] args) {
		
		// die methode createArray soll ein string array mit den angegeben werten anlegen
		
		string_array = createArray("David", 10);
		
		// iteriere über das array und gebe jeden Wert in der console aus.
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		grid = createGrid(2,10,"x");
		
		// iteriere über jede zelle des grids und gebe spalte und zeile aus sowie den inhalt
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
		String gridAsString = gridAsString(grid):
		System.out.println(gridAsString);
		
	}
	
	

}
