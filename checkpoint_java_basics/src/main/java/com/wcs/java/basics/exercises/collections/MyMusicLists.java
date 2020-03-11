package com.wcs.java.basics.exercises.collections;

public class MyMusicLists extends AllSongs<Song> {
	public static void main(String[] args) {
		MyMusicLists playlist = new MyMusicLists();
		MyMusicCollection myMusicCollection = new MyMusicCollection();
		
		Song a = new Song("Yesterday", "The Beatles", 234);
		Song b = new Song("Song Two", "Blur", 120);
		Song c = new Song("München halt", "Main Concept", 345);
		
		
		myMusicCollection.addSong(a);
		myMusicCollection.addSong(b);
		myMusicCollection.addSong(c);
		myMusicCollection.addSong(b);
		myMusicCollection.addSong(c);
		myMusicCollection.deleteSong(a);
		
		playlist.addSong(a);
		playlist.addSong(b);
		playlist.addSong(c);
		playlist.addSong(b);
		playlist.addSong(c);
		playlist.deleteSong(a);
		
		System.out.println("\nPlaylist:\n---------");
		for (Song song : playlist) {
			System.out.println("- \"" + song.getName() + "\" von \"" + song.getArtist() + "\" - Dauer: " + song.getDurationInSeconds() + " Sekunden");
		}
		
		System.out.println("\nSammlung:\n---------");
		for (Song song : myMusicCollection) {
			System.out.println("- \"" + song.getName() + "\" von \"" + song.getArtist() + "\" - Dauer: " + song.getDurationInSeconds() + " Sekunden");
		}
	}
}
