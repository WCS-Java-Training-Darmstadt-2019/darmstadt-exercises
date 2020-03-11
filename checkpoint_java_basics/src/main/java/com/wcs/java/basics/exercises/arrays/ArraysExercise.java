package com.wcs.java.basics.exercises.arrays;

import java.util.ArrayList;
import java.util.List;

import com.wcs.java.basics.exercises.collections.Song;

/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {

	public static void main(String[] args) {

		// die methode createArray soll ein string array mit den angegeben werten
		// anlegen

		String[] array = { "David", "10" };

		// iteriere über das array und gebe jeden Wert in der console aus.

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt)
		// erstellt und jeden wert mit dem übergabe wert füllt.

		System.out.println(createGrid(3, 10, "|x"));

		// iteriere über jede zelle des grids und gebe spalte und zeile aus sowie den
		// inhalt
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
		// String gridAsString = gridAsString(grid):
		// System.out.println(gridAsString);

		for (int elem : Sieb()) {
			System.out.println(elem);
		}

	}

	public static String createGrid(int x, int y, String value) {
		String s = "";
		String[][] grid = new String[x][y];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = value;
				s += grid[i][j];
			}
			s += "|" + "\n";
		}

		return s;

	}

	public static int[] Sieb() {
	int zahl = 2;
	int grenze = 10;
	
	 ArrayList<Integer> numbers = new ArrayList<>();
	
	for (int i = 2; i < 9; i++) {
		for (int j = 0; j<grenze;j++) {
			zahl += i;
		}
	}
	
		
		int[] ergebnis = new int[zahlen.length];
		int i = 0;
		for (Integer number : zahlen) {
			ergebnis[i] = number;
			i++;
		}
		return ergebnis;
	}

}
