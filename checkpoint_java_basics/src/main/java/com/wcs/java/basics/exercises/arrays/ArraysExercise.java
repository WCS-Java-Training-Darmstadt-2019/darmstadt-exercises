package com.wcs.java.basics.exercises.arrays;


/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	
	
	public static void main(String[] args) {
		
		// die methode createArray soll ein string array mit den angegeben werten anlegen
		
		String[] string_array = new String [] {"David", "10"}; //createArray("David", 10);
		for (int i=0; i<string_array.length; i++) {
			System.out.println(string_array[i]);
		};
		
		System.out.println();
		
		// iteriere über das array und gebe jeden Wert in der console aus.
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		String [][] grid = new String [2][10];
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[i].length; j++) {
				grid[i][j]="x";
			}
		};
		
		for (int x=0; x<grid.length; x++) {
			for (int y=0; y<grid[x].length; y++) {
				System.out.println("x:"+ x + ",y=" + y + ",value=" + grid[x][y]);
			}
		}
		System.out.println();
		
		for (int x=0; x<grid.length; x++) {
			System.out.println();
			for (int y=0; y<grid[x].length; y++) {
				System.out.print(grid[x][y]);
			}
		}
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
	//	String gridAsString = gridAsString(grid):
	//	System.out.println(gridAsString);
		
	}
	
	

}
