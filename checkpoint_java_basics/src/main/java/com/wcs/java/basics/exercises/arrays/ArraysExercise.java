package com.wcs.java.basics.exercises.arrays;


/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {
	
	
	public static void main(String[] args) {
		// Diese Klasse kompiliert nicht. Bitte schreibe den Code so, dass sie kompiliert.
		// Erstelle die Methode createArray(String wert, int size) die ein Array in der angegebenen Grösse erstellt
		// und jedes Element wird dem wert gefüllt
		// dh. in diesem Beispiel soll ein arry mit 10 element angelegt werden, 
		// Ergebnis wäre = {"David","David","David","David","David","David","David","David","David","David"}
		
		String[] string_array = createArray("David", 10);
		
		// iteriere über das array und gebe jeden Wert in der console aus.
		
		for (String a : string_array) {
			System.out.println (a);
		}
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		char[][] grid = createGrid(2,10,'x');
		
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
		
		String thisGridAsString = gridAsString(grid);
		System.out.println(thisGridAsString);
		
	}
	
	public static String[] createArray(String name, int size) {
		
		String[] newArray = new String [size];
			for (int a = 0; a < newArray.length; a++) {
				newArray[a] = name;
			}
			
	return newArray;
		
	}
	
	public static char[][] createGrid(int rows, int columns, char symbol)  {
		char[][] newGrid = new char[rows][columns];
			for (int row = 0; row < rows; row++){
				for (int col = 0; col < columns; col++) {
				newGrid[row][col] = symbol;
				}
			}
	return newGrid;
		
	}
	
	public static String gridAsString(char [][]grid) {
		
		String thisGridAsString ="";
		
		for (int box = 0; box < (grid[0].length*2)+1; box++) {
			thisGridAsString +="-";
		}
		thisGridAsString +="\n";
		
		for (int row = 0; row < grid.length; row++) {
			thisGridAsString += "|";
			for (int col = 0; col < grid[row].length; col++) {
			thisGridAsString += grid[row][col];
			thisGridAsString += "|";
			}
			thisGridAsString += "\n";
		}
		
		for (int box = 0; box < (grid[0].length*2)+1; box++) {
			thisGridAsString +="-";
		}
		thisGridAsString +="\n";
		
	return thisGridAsString;
	}
	
	
}
