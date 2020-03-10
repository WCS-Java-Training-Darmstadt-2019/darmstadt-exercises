package com.wcs.java.basics.exercises.collections;

public class Playlist extends Bibliothek{

	public Playlist() {
		super();
	}
	
	@Override
	public void addSong(Song song) {
		getSongList().add(song);
	}
}
