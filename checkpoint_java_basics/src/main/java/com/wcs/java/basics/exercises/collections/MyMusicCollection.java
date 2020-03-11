package com.wcs.java.basics.exercises.collections;

public class MyMusicCollection extends AllSongs<Song> {
	@Override
	public void addSong(Song song) {
		if (getAllSongs().contains(song)) {
			System.out.println("FEHLER: \"" + song.getName() + "\" wäre doppelt in der Sammlung.");
		} else {
			getAllSongs().add(song);
		}
	}
}
