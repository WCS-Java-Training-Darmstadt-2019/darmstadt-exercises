package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Musiksammlung extends Songlist implements SongListTools{
	
	HashSet<Song> musiksammlung;
	
	public Musiksammlung () {
	super();
		}
	
	public Musiksammlung (String owner, HashSet<Song> musiksammlung) {
		super();
		this.owner = owner;
		this.musiksammlung = musiksammlung;
			}

	@Override
	public void addSong (Song song) {
		this.musiksammlung.add(song);
	}
	
	@Override
	public void deleteSong (Song song) {
		this.musiksammlung.remove(song);
	}
	
	@Override
	public List<Song> getSonglist() {
		List<Song> songlist = new ArrayList<Song>(this.musiksammlung);
		return songlist;
	}
	
	@Override
	public void setSonglist(List<Song> songlist) {
		this.musiksammlung = new HashSet<> (songlist);
	}
	
}
