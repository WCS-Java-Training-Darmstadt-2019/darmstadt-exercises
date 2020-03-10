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
		
		String[] string_array;
		string_array = createArray("David", 10);
		
		// iteriere über das array und gebe jeden Wert in der console aus.
		
		// erstelle eine methode die ein 2 dimensionales array (hier grid genannt) erstellt und jeden wert mit dem übergabe wert füllt.
		
		char[][] grid;
		grid = createGrid(2,10,'x'); //Hab ein char draus gemacht. Alternativ einfach ein 2-dimensionales String Array nehmen.
		
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
		//String gridAsString = gridAsString(grid):
		//System.out.println(gridAsString);
		
	}
	
	public static String[] createArray(String name, int size) {
		String[] string = new String[size];
		
		for(int i=0;i<string.length-1;i++) {
			string[i] = name;
			System.out.print(string[i]+",");
		}
		string[string.length-1]=name;
		System.out.print(name);
		System.out.println();
		return string;
	}
	
	public static char[][] createGrid(int rows, int columns, char x)  {
		char[][] grid = new char[rows][columns];
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				grid[i][j] = 'x';
				System.out.println("x:"+i+",y="+j+",value="+grid[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0;i<grid[0].length+10;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print("|"+grid[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		
		for(int i=0;i<grid[0].length+10;i++) {
			System.out.print("-");
		}
		
		return grid;
	}
	
	

}
