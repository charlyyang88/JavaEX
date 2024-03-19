package com.javaex.basic.loop;

public class ForGuguEx {

	public static void main(String[] args) {
		int dan;
		int i;

		for (dan = 2; dan <= 9; dan++) {
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
			System.out.println();
		}
	}
}
