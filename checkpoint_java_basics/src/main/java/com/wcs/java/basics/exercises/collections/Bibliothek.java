package com.wcs.java.basics.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

	private List<Song> songList = new ArrayList<Song>();

	public List<Song> getSongList() {
		return songList;
	}

	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

	public void deleteSong(Song song){
		songList.remove(song);
		//songList.remove(songNumber);
	}
	
	public void deleteSong(int songNumber) {
		songList.remove(songNumber);
	}

	public void addSong(Song song) {
	
	}

}
