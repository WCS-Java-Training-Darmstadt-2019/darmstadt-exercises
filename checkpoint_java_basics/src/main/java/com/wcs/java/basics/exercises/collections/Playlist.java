package com.wcs.java.basics.exercises.collections;

import java.util.*;

public class Playlist extends Bibliothek {
	static List<Song> playlist = new ArrayList<>();
	
	public static void addSongToPlaylist(String name, String interpret, int dauer) {

		//super().
		getPlaylist().add(new Song(name, interpret, dauer));

	}
	
	public static void deleteSongFromPlaylist() {
		
	}

}
