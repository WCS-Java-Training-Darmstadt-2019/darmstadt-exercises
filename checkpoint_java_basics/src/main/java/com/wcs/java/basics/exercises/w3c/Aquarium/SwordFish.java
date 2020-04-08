package com.wcs.java.basics.exercises.w3c.Aquarium;

public class SwordFish extends Fisch {

	public SwordFish(String aussehen, String aussehenZurück, int position, int schwimmTiefe, int geschwindigkeit) {
		super(aussehen, aussehenZurück, position, schwimmTiefe, geschwindigkeit);
		// TODO Auto-generated constructor stub
	}

	SwordFish swordFish = new SwordFish("--<()><", "><()>--", 1, 4, 2);

	@Override
	public void swim() {

		int[] swordFishWo = new int[] { swordFish.getPosition(), swordFish.getSchwimmTiefe() };

		int[] swordFishWeiter = new int[] { swordFish.getPosition() + swordFish.getGeschwindigkeit(),
				swordFish.getSchwimmTiefe() };

		swordFish.setPosition(swordFishWeiter[0]);

		int[] swordFishWeiterZurueck = new int[] { swordFish.getPosition() - swordFish.getGeschwindigkeit(),
				swordFish.getSchwimmTiefe() };

		swordFish.setPosition(swordFishWeiterZurueck[0]);

	}

}
