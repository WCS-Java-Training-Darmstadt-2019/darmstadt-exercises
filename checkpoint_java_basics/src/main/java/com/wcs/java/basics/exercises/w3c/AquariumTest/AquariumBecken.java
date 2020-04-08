package com.wcs.java.basics.exercises.w3c.AquariumTest;

public class AquariumBecken {

		private String seitenElement = "|";
		private String bodenElement = "-";
		private String eckElement = "+";
		private String wasser = " ";
		private int hoehe = 14;
		private int breite = 40;

		private String[][] aquariumHuelle = new String[hoehe][breite];

		public String[][] aquariumBau() {
			for (int i = 0; i < hoehe; i++) {
				aquariumHuelle[i][0] = seitenElement;
				aquariumHuelle[i][breite - 1] = seitenElement;
			}
			aquariumHuelle[hoehe - 1][0] = eckElement;
			aquariumHuelle[hoehe - 1][breite - 1] = eckElement;
			for (int i = 0; i < hoehe - 1; i++) {
				for (int j = 1; j < breite - 1; j++) {
					aquariumHuelle[i][j] = wasser;
				}
			}
			for (int j = 1; j < breite - 1; j++) {
				aquariumHuelle[hoehe - 1][j] = bodenElement;
			}

			return aquariumHuelle;
		}
		
		public AquariumBecken() {
		}

		public AquariumBecken(String[][] aquariumHuelle, String wasser) { 
			this.aquariumHuelle=aquariumHuelle;
		}
				
		public void setAquariumHuelle(String[][] aquariumHuelle) {
			this.aquariumHuelle = aquariumHuelle;
		}

		public String[][] getAquariumHuelle() {
			return aquariumHuelle;
		}

//		public void callGuppi () {
//			Guppi guppi = new Guppi (1,1,1);
//			guppi.swim1();
//		}
		
		public void aquariumAusgabe() {
			for (int i = 0; i < hoehe; i++) {
				System.out.println();
				for (int j = 0; j < breite; j++) {
					Guppi guppi = new Guppi (1,1,1);
					guppi.swim1();
					
					System.out.print(aquariumBau()[i][j]);
				}

			}

		}
	}