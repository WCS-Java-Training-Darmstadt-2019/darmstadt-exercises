package com.wcs.java.basics.exercises.w3c.MinMax;

import java.util.Random;

public class Array_mischen {

	private static String[] arrayMix(String[] zahlen) {
		String tmp;
		String rand; 
		Random r = new Random();
		for (int i = 0; i < zahlen.length; i++) {
			rand = r.   (zahlen.length);
			tmp = zahlen[i];
			zahlen[i] = zahlen[rand];
			zahlen[rand] = tmp;
		}
		return zahlen;
	}

	public static void main(String[] args) {
		String[] zahlen = { "A", "A", "B", "B", "C", "C", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I",
				"K", "K", "M", "M", "N", "N", "O", "O", "P", "P", "Q", "Q" };
		System.out.println("der Array ist " + zahlen.length + "lang");
		zahlen = arrayMix(zahlen);
		for (int i = 0; i < zahlen.length; i++)
			System.out.println(i);
		System.out.println("der Array ist " + zahlen.length + "lang");
	}
}