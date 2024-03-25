package com.javaex.oop.song.v2;

public class SongApp {
	
	public static void main(String[] args) {
		Song iu = new Song("좋은날", "아이유", "Real", 
				"이민수 작곡", 2010, "3번 track");
//		iu.setTitle("좋은날");
//		iu.setArtist("아이유");
//		iu.setAlbum("Real");
//		iu.setComposer("이민수 작곡");
//		iu.setYear(2010);
//		iu.setTrack("3번 track");
		
		Song bigbang = new Song("거짓말", "BIGBANG", "Aways",
				"G-DRAGON 작곡", 2007, "2번 track");
//		bigbang.setTitle("거짓말");
//		bigbang.setArtist("BIGBANG");
//		bigbang.setAlbum("Aways");
//		bigbang.setComposer("G-DRAGON 작곡");
//		bigbang.setYear(2007);
//		bigbang.setTrack("2번 track");
		
		Song busker = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집",
				"장범준 작곡", 2012, "4번 track");
//		busker.setTitle("벚꽃엔딩");
//		busker.setArtist("버스커버스커");
//		busker.setAlbum("버스커버스커1집");
//		busker.setComposer("장범준 작곡");
//		busker.setYear(2012);
//		busker.setTrack("4번 track");
		
		iu.showinfo();
		bigbang.showinfo();
		busker.showinfo();
		
	}

}
