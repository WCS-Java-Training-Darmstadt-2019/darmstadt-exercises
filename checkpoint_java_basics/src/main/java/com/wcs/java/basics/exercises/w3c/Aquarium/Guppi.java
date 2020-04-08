package com.wcs.java.basics.exercises.w3c.Aquarium;

public class Guppi extends Fisch {

	public Guppi(String aussehen, String aussehenZurück, int position, int schwimmTiefe, int geschwindigkeit) {
		super(aussehen, aussehenZurück, position, schwimmTiefe, geschwindigkeit);
		// TODO Auto-generated constructor stub
	}

	Guppi guppi = new Guppi("<><", "><>", 1, 0, 1);
	Guppi guppi2 = new Guppi("<><", "><>", 1, 2, 1);

	int direction = 1;

	@Override
	public void swim() {

		direction = direction * (-1);

		int[] guppiWo = new int[] { guppi.getPosition(), guppi.getSchwimmTiefe() };

		if (direction == 1) {

			for (int i = 0; i < getAquariumBecken().aquariumBau()[guppi.getSchwimmTiefe()].length - 2
					- getAussehen().length(); i++) {

				int[] guppiWeiter = new int[] { guppi.getPosition() + guppi.getGeschwindigkeit(),
						guppi.getSchwimmTiefe() };

				guppi.setPosition(guppiWeiter[0]);

			}
		} else {

			for (int i = 0; i < getAquariumBecken().aquariumBau()[guppi.getSchwimmTiefe()].length - 2
					- getAussehen().length(); i++) {

				int[] guppiWeiterZurueck = new int[] { guppi.getPosition() - guppi.getGeschwindigkeit(),
						guppi.getSchwimmTiefe() };

				guppi.setPosition(guppiWeiterZurueck[0]);
			}
		}
		AquariumBecken aquariumBecken = new AquariumBecken();
		aquariumBecken.addFisch(guppi);
		aquariumBecken.addFisch(guppi2);
	}

}
