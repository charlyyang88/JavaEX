package com.javaex.oop.song.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getTrack() {
		return track;
	}
	
	public void showinfo() {
		System.out.printf("%s, %s (%s, %d, %s, %s)%n",artist, title, album, year, track, composer);
	}
	
}
