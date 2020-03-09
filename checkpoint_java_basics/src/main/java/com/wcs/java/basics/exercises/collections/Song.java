package com.wcs.java.basics.exercises.collections;

public class Song {
	
	String name;
	String artist;
	int durationInSeconds;
	
	public Song(String name, String artist, int durationInSeconds) {
		super();
		this.name = name;
		this.artist = artist;
		this.durationInSeconds = durationInSeconds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(int durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}
	
	

}
