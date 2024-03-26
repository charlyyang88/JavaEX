package com.javaex.oop.tv;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		tv.status(); // 꺼져있는 상태
		
		tv.power(true); // 전원 켜기
		tv.volume(120); // 음량의 범위를 벗어남
		tv.status();

		tv.channel(false); // 채널의 범위를 벗어남
		tv.status();

		tv.channel(true); // channel +1
		tv.channel(true); // channel +1
		tv.channel(true); // channel +1
		tv.status();

		tv.power(false);
		tv.status();
	
	}

}
