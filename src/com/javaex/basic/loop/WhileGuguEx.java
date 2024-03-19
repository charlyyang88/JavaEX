package com.javaex.basic.loop;

public class WhileGuguEx {

	public static void main(String[] args) {
		int dan=2;
		
		while (dan <= 9) {
			int i=1;
			while (i <= 9) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				i += 1;
			}
			System.out.println();
			dan += 1;
		}

	}

}
