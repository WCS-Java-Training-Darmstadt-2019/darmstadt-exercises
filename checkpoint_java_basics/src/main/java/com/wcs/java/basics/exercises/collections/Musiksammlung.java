package com.wcs.java.basics.exercises.collections;

import java.util.*;

public class Musiksammlung {

	static Set<Song> songSammlung = new HashSet<Song>();

	public static void main(String[] args) {

		songEingabe();
		System.out.println(Musiksammlung.getSongsFromMusiksammlung());
		System.out.println(Playlist.getAllSongsFromList());

	}

	public static void songEingabe() {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Moechten Sie einen Song zu Ihrer Musiksammlung hinzufügen? " + "\n"
					+ "tippen Sie 'j' für Ja und 'n' fuer nein");

			String s = scanner.nextLine();

			if (!s.equals("j")) {
				break;
			} else if (s.equals("j")) {
				System.out.println("Name des Songs: ");
				String name = scanner.nextLine();

				System.out.println("Interpret des Songs: ");
				String interpret = scanner.nextLine();

				System.out.println("Dauer des Songs in Sekunden: ");
				String dauer1 = scanner.nextLine();
				int dauer = Integer.parseInt(dauer1);

				System.out.println("Moechten Sie diesen Song zu Ihrer Playlist hinzufügen? j/n.");
				String addSong = scanner.nextLine();

				if (addSong.equals("j")) {
					Playlist.addSongToPlaylist(name, interpret, dauer);
					songSammlung.add(new Song(name, interpret, dauer));
					System.out.println("Der Song wurde Ihrer Musiksammlung und Ihrer Playlist hinzugefügt" + "\n");

				} else {
					songSammlung.add(new Song(name, interpret, dauer));
					System.out.println("Der Song wurde in die Musiksammlung aufgenommen" + "\n");
				}
			}
		}
		scanner.close();
		System.out.println("Bye..." + "\n");
	}

	public static String getSongsFromMusiksammlung() {
		int i = 1;
		String s = "";
		for (Song aSong : songSammlung) {
			s += "Song nr." + i + " in Ihrer Musiksammlung: '" + aSong.getName() + "' von '" + aSong.getArtist()
					+ "' mit " + aSong.getDurationInSeconds() + " Sekunden Laufzeit\n";
			i++;
		}
		return s;
	}

	public static void deleteSongFromMusiksammlung() {

	}
}