package com.wcs.java.basics.exercises.collections;

public class MusikSammlung extends MusikContainer{

	@Override
	public void songHinzufuegen(Song song) {
		if (this.musiksammlung.contains(song)==false) {
			super.songHinzufuegen(song);
			System.out.println("Der Song \"" + song.getName() + "\" wurde zur Musiksammlung hinzugefügt.");
		} else {
			System.out.println("Der Song \"" + song.getName() + "\" ist bereits in der Liste enthalten!");
		}
	}

	

}
	
	