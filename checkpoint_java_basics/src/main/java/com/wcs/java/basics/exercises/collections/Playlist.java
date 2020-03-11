package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Playlist extends Songlist implements SongListTools{
	
	ArrayList<Song> playlist;
	
	public Playlist() {
		super();
	}
	
	public Playlist (String owner, ArrayList<Song> playlist) {
		this.owner = owner;
		this.playlist = playlist;
	}
	
	@Override
	public void addSong (Song song) {
		this.playlist.add(song);
	}
	
	@Override
	public void deleteSong (Song song) {
		this.playlist.remove(song);
	}
		
	@Override
	public List<Song> getSonglist() {
		return this.playlist;
	}
	
	@Override
	public void setSonglist(List<Song> songlist) {
		this.playlist = new ArrayList<Song> (songlist);
	}
	
		
}
