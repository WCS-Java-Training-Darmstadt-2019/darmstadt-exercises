package com.wcs.java.basics.exercises.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public abstract class Songlist {
	String owner;
	//List<Song> songlist;

	public Songlist() {
		super();
	}
	
//	public Songlist(String owner, List<Song> songlist) {
//		super();
//		this.owner = owner;
//		this.songlist = songlist;
//	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

//	public List<Song> getSonglist() {
//		return songlist;
//	}
//
//	public void setSonglist(ArrayList<Song> songlist) {
//		this.songlist = songlist;
//	}

}
