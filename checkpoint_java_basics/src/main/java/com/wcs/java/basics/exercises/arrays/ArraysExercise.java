package com.wcs.java.basics.exercises.arrays;

/**
 * 
 * @author dbe
 *
 */
public class ArraysExercise {

	public static void main(String[] args) {

		createArray("David", 10);
		String[][] xy = createGrid(3, 10, "x");
		String grid = gridAsString(xy);
		System.out.println(grid);
	}

	public static void createArray(String name, int size) {
		String[] davidArray = new String[size];
		for (int i = 0; i < davidArray.length; i++) {
			davidArray[i] = name;
			System.out.println(davidArray[i]);
		}
	}

	public static String[][] createGrid(int rows, int columns, String fillChar) {
		String[][] grid = new String[rows][columns];
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c] = fillChar;
				System.out.println("x: " + c + ", y: " + r + ", " + "value: " + grid[r][c]);
			}
		}
		return grid;
	}

	public static String gridAsString(String[][] grid) {
		String result = "";
		// Header mit "-"
		result = createHeaderFooterLine(grid) + "\n";
		// Body mit "x"
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				result += "|" + grid[r][c];
			}
			result += "|\n";
		}
		// Footer mit "-"
		return result += createHeaderFooterLine(grid);
	}

	private static String createHeaderFooterLine(String[][] grid) {
		String result = "";
		for (int i = 0; i < (grid[0].length * 2) + 1; i++) {
			result += "-";
		}
		return result;
	}
}