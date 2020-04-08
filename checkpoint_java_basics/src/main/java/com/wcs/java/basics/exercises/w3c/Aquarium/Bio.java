package com.wcs.java.basics.exercises.w3c.Aquarium;

public class Bio {

	static int direction = 1;

	public void bio(AquariumBecken fischBecken, Guppi guppi) {

		String [][] bioBecken = fischBecken.getAquariumHuelle();
		int height = bioBecken.length;
		int board = bioBecken[height - 1].length;
		int swimlane;
		int guppiLaenge = guppi.getAussehen().length();


			direction = direction * (-1);
		

			if (direction == -1) {
				for (swimlane = 1; swimlane < board - guppiLaenge; swimlane++) {
					for (int w = 0; w < guppiLaenge; w++) {
						bioBecken[guppi.getSchwimmTiefe()][swimlane + w] = guppi.getAussehen().substring(w, w + 1);
					}
					try {
						Thread.sleep(150);
						for (int i = 0; i < height; i++) {
							System.out.println();
							for (int j = 0; j < board; j++) {
								System.out.print(bioBecken[i][j]);
							}
						}
					} catch (InterruptedException e) {
						System.out.println("keine Ahnung warum das nicht funktioniert.");
						e.printStackTrace();
					}
					for (int i = 1; i < board - 1; i++) {
						bioBecken[guppi.getSchwimmTiefe()][i] = fischBecken.getWasser();
					}
				}
			} else {
				for (swimlane = board - 1 - guppiLaenge; swimlane > 0; swimlane--) {
					for (int w = 0; w < guppiLaenge; w++) {

						bioBecken[guppi.getSchwimmTiefe()][swimlane + w] = guppi.getAussehenZurück().substring(w,
								w + 1);
					}
//					System.out.println("Höhe " + height + " Breite " + board);
					try {
						Thread.sleep(150);
						for (int i = 0; i < height; i++) {
							System.out.println();
							for (int j = 0; j < board; j++) {
								System.out.print(bioBecken[i][j]);
							}
						}
					} catch (InterruptedException e) {
						System.out.println("keine Ahnung warum das nicht funktioniert.");
						e.printStackTrace();
					}
					for (int i = 1; i < board - 1; i++) {
						bioBecken[guppi.getSchwimmTiefe()][i] = fischBecken.getWasser();
					}
				}

			}
		}
	}