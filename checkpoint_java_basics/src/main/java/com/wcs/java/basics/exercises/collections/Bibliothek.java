package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

	static List<Song> playlist = new ArrayList<>();

	public static List<Song> getPlaylist() {
		return playlist;
	}

	public static void setPlaylist(List<Song> playlist) {
		Bibliothek.playlist = playlist;
	}
	
	public static String getAllSongsFromList() {
		int i = 1;
		String s = "";
		for (Song aSong : playlist) {
			s += "Song nr." + i + " in Ihrer Playlist: '" + aSong.getName() + "' von '" + aSong.getArtist() + "' mit "
					+ aSong.getDurationInSeconds() + " Sekunden Laufzeit\n";
			i++;
		}
		return s;
	}
}
