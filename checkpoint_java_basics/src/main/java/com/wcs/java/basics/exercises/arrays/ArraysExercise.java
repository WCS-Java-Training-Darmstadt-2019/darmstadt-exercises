package com.wcs.java.basics.exercises.arrays;

/**
 * @author dbe
 */
public class ArraysExercise {

    // David
    public static String[] createArray(String name, int size) {
        String[] string_array = new String[size];
        for (int i = 0; i < size; i++) {
            string_array[i] = name;
            System.out.print(string_array[i] + ", ");
        }
		System.out.println("\n");
        return string_array;
    }

    // x, y Werte
    public static char[][] grid(int x, int y, char v) {
        char[][] gridArray = new char[x][y];
        for (int r = 0; r < gridArray.length; r++) {
            for (int s = 0; s < gridArray[r].length; s++) {
                gridArray[r][s] = v;
				System.out.println("x = " + r + ", y = " + s + ", value = " + v);
            }
        }
        return gridArray;
    }

    // Grid


    // Main Methode
    public static void main(String[] args) {
        createArray("David", 10);
        grid(10, 2, 'x');
    }
}
