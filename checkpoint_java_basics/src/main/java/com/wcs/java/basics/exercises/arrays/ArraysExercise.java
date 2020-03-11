package com.wcs.java.basics.exercises.arrays;


/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	

	private static String[] createArray(String name, int size) {
		String[] list = new String[size];
		for (int i = 0; i < size; i++) list[i] = name;
		return list;
	}

	private static String[][] createGrid(int y, int x, String text) {
		String[][] list = new String[y][x];
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {
				System.out.println("y: " + j + " - x: " + i + " - value: " + text);
				list[j][i] = text;
			}
		}
		return list;
	}

	private static String gridAsString(String[][] grid) {
		String out = createLine(grid[0].length) + "\n";
		for (int y = 0; y < grid.length; y++) {
			out += "|";
			for (int x = 0; x < grid[y].length; x++) out += grid[y][x] + "|";
			out += "\n";
		}
		out += createLine(grid[0].length);
		return out;
	}

	private static String createLine(int size) {
		String line = "";
		for (int i = 0; i < size * 2 + 1; i++) line += "-";
		return line;
	}

	public static void main(String[] args) {
		
		// die methode createArray soll ein string array mit den angegeben werten anlegen
		
		String[] string_array = createArray("David", 10);
		
		// iteriere über das array und gebe jeden Wert in der console aus.

		for (String zeile : string_array) {
			System.out.println (zeile);	
		}
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		String[][] grid = createGrid(3,10,"x");
		
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
		String gridAsString = gridAsString(grid);
		System.out.println(gridAsString);
		
	}
	
	

}
