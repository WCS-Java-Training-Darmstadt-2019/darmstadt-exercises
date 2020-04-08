package com.wcs.java.basics.exercises.w3c.QuadGleichung;

import java.util.Scanner;

public class QuadGleichung {

	public static void main(String[] args) {
		Double x;
		Double a;
		Double b;
		Double c;
		Double x2;

		System.out.println(
				"Bitte geben die Sie drei Parameter a, b, und c ein um die beiden Lösungen x und x2 der Geleichung");
		System.out.println("ax2+bx+c=0");
		System.out.println("zu ermitteln.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie zunächst a ein:");
		a = sc.nextDouble();
		System.out.println("Bitte geben Sie b ein:");
		b = sc.nextDouble();
		System.out.println("Bitte geben Sie c ein:");
		c = sc.nextDouble();

		x = ((b * -1) + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a); // potenzieren: math.pow( wert, wert2);

		x2 = ((b * -1) - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);

		System.out.println("x = " + x);
		System.out.println("x2 = " + x2);
		
	}

}
