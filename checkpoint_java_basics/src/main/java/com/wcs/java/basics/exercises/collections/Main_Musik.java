package com.wcs.java.basics.exercises.collections;

public class Main_Musik {

	public static void main(String[] args) {

		MusikContainer musikSammlung = new MusikSammlung();
		MusikContainer playList = new Playlist();

		Song[] songs = { 
				new Song("Alle meine Entchen", "Heino", 120), 
				new Song("Alle meine Entchen", "Heino", 120),
				new Song("blau blüht der Enzian", "Falco", 120), 
				new Song("Kommisar", "Falco", 120),
				new Song("Jeanne", "Heino", 120) };

		for (int i = 0; i < songs.length; i++) {
			musikSammlung.songHinzufuegen(songs[i]);
			System.out.println("Der Song \"" + songs[i].getName() + "\" wurde zur Musiksammlung hinzugefügt.");
			playList.songHinzufuegen(songs[i]);
			System.out.println("Der Song \"" + songs[i].getName() + "\" wurde zur Playlist hinzugefügt.");
		}

	}

}
