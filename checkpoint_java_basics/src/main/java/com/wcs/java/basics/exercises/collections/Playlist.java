package com.wcs.java.basics.exercises.collections;

import java.util.*;

public class Playlist extends Bibliothek {
	static List<Song> playlist = new ArrayList<>();
	
	public static void addSongToPlaylist(String name, String interpret, int dauer) {

		//super().
		getPlaylist().add(new Song(name, interpret, dauer));
		playlist.add(new Song(name, interpret, dauer));

	}

//	public static String getSongsFromPlaylist() {
//		int i = 1;
//		String s = "";
//		for (Song aSong : playlist) {
//			s += "Song nr." + i + " in Ihrer Playlist: '" + aSong.getName() + "' von '" + aSong.getArtist() + "' mit "
//					+ aSong.getDurationInSeconds() + " Sekunden Laufzeit\n";
//			i++;
//		}
//		return s;
//	}
	
	public static void deleteSongFromPlaylist() {
		
	}

}
