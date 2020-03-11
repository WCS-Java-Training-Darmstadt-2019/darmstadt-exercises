package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class MusikContainer {

	List<Song> musiksammlung = new ArrayList<Song>();

	public void songHinzufuegen(Song song) {
		musiksammlung.add(song);
	}

}
