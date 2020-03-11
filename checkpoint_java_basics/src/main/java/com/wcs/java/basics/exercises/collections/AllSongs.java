package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AllSongs<Song> implements Iterable<Song> {
    private List<Song> allSongs = new ArrayList<Song>();
       
    public List<Song> getAllSongs() {
		return allSongs;
	}

	public void setAllSongs(List<Song> allSongs) {
		this.allSongs = allSongs;
	}

	public void addSong(Song song) {
		allSongs.add(song);
	}

	public void deleteSong(Song song) {
		allSongs.remove(song);
	}
	
	@Override
    public Iterator<Song> iterator() {
        return allSongs.iterator();
    }
}
