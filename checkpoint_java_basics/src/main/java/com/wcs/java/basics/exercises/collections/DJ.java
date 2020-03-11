package com.wcs.java.basics.exercises.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DJ {

	public static void main (String [] args) {
		
		Song Waterloo = new Song ("Waterloo", "Abba", 200);
		Song Sexmachine = new Song ("Sex Machine", "James Brown", 222);
		Song Superstitious = new Song ("Superstitious", "Stevie Wonder", 211);
		
		/*Set<Song> deine = new HashSet<Song>();
		deine.add(Waterloo);
		deine.add(Sexmachine);
		deine.add(Superstitious);*/
		
//		List<Song> emptySongList = Collections.<Song>emptyList(); //erzeugt leere Liste (not Null), damit bei add keine NullPointerException auftritt
//		HashSet<Song> emptyMusiksammlung = new HashSet<>(emptySongList);
		
		HashSet<Song> emptyMusiksammlung = new HashSet<>(Collections.<Song>emptyList());
						
		Musiksammlung deine = new Musiksammlung("deine", emptyMusiksammlung);
		deine.addSong(Waterloo);
		deine.addSong(Sexmachine);
		deine.addSong(Superstitious);
		
		ArrayList<Song> emptyPlaylist = new ArrayList<Song>(Collections.<Song>emptyList());
		
		Playlist heute = new Playlist("heute", emptyPlaylist);
		heute.addSong(Waterloo);
		heute.addSong(Waterloo);
		heute.addSong(Waterloo);
		heute.deleteSong(Waterloo);
		
		System.out.println("Erster Titel in der Sammlung: " + deine.getSonglist().iterator().next().getName());
		
		System.out.println("Deine Sammlung:");
		for (Song s : deine.getSonglist()) {
			System.out.println(s.getName() + " von " + s.getArtist());
		}
		
		System.out.println("Heutige Playlist:");
		for (Song s : heute.getSonglist()) {
			System.out.println(s.getName() + " von " + s.getArtist());
		}
		
		
/*System.out.println("Erster Titel in der Sammlung: " + deine.iterator().next().getName());
		
		System.out.println("Deine Sammlung:");
		for (Song s : deine) {
			System.out.println(s.getName() + " von " + s.getArtist());
		}
*/
	}

}
