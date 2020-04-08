package com.wcs.java.basics.exercises.w3c.TanteEmma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TanteEmma {

	public static void main(String[] args) {
		Map<String, Ware> map = new HashMap<String, Ware>(); // Schlüssel - Wert - Name der Variablen
		Ware playstation = new Ware("Playstation", 199, 0.19, 0);
		Ware gummibaerchen = new Ware("Gummibärchen", 0.05, 0.07, 0);
		Ware lakritzstange = new Ware("Lakritzstange", 0.30, 0.07, 0);
		map.put("Asterix", playstation);
		map.put(gummibaerchen.getName(), gummibaerchen);
		map.put(lakritzstange.getName(), lakritzstange);

		Scanner sc = new Scanner(System.in);
		Ware produkt = null;
		do {
			System.out.println(
					"Welchen Artikel möchten Sie kaufen - Playstation, Gummibärchen, Lakritzstange? - bitte geben Sie einen ein.");
			String articlekey = sc.next();
			produkt = map.get(articlekey);
			if (produkt == null) {
				System.out.println("Produkt nicht gefunden, bitte erneut eingeben!");
			}
		} while (produkt == null);

		System.out.println("Welche Anzahl soll es sein?");
		int menge = sc.nextInt();

		produkt.setAmount(menge);

		produkt.rechnung();

	}

}
