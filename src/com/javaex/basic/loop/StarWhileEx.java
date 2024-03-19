package com.javaex.basic.loop;

public class StarWhileEx {

	public static void main(String[] args) {
		int j = 1;
		while (j <= 6) {
			int i = 1;
			while (i <= j) {
				System.out.print("*");
				i += 1;
			}
			System.out.println();
			j += 1;
		}
	}

}
