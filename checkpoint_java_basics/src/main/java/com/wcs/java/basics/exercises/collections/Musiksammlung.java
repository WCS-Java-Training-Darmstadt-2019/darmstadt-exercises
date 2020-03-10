package com.wcs.java.basics.exercises.collections;

public class Musiksammlung extends Bibliothek {

	public Musiksammlung() {
		super();
	}
	
	@Override
	public void addSong(Song song) {
		boolean songExists = true;
		
		for(Song songItem : getSongList()) {
			//Muss ich equals überschreiben damit flach geprüft wird? Glaube das Equals vergleich die Referenz....?!?
			if(songItem.equals(song)) {
				System.out.println("Dieses Lied wurde schon in der Liste gespeichert");
				songExists = false;
				break;
			}
		}
		if(songExists) {
			getSongList().add(song);
		}	
	}
}
