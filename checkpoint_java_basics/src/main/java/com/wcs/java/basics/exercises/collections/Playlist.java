package com.wcs.java.basics.exercises.collections;

public class Playlist {

	Song song;

	public Playlist(Song song) {
		super();
		this.song = song;
	}

	public Playlist() {
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

}
