package com.wcs.java.basics.exercises.collections;

import java.util.List;

public interface SongListTools {

	public void addSong (Song song) ;
		
	public void deleteSong (Song song) ;
	
	public List<Song> getSonglist() ;

	public void setSonglist(List<Song> songlist) ;
	
}
