package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;

public class MusikSammlung {

	Song song;

	public MusikSammlung(Song song) {
		super();
		this.song = song;
	}

	public MusikSammlung() {
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
	ArrayList<Song> Musiksammlung = new ArrayList<Song>();
	
	public void Song_hinzufügen (Song song) {
		Musiksammlung.add(getSong());
	}

}
	
	
