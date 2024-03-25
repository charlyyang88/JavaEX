package com.javaex.oop.song.v3;

public class SongApp {
	
	public static void main(String[] args) {
		Song iu = new Song("좋은날", "아이유", "Real", 
				"이민수 작곡", 2010, "3번 track");
		
		Song bigbang = new Song("거짓말", "BIGBANG", "Aways",
				"G-DRAGON 작곡", 2007, "2번 track");
		
		Song busker = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집",
				"장범준 작곡", 2012, "4번 track");
		
		iu.showinfo();
		bigbang.showinfo();
		busker.showinfo();
		
	}

}
