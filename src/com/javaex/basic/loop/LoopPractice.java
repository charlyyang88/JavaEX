package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
		forGugu();
		whileGugu();
		forStar();
		whileStar();
	}
	public static void forGugu() {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
			System.out.println();
		}
	}
	public static void whileGugu() {
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
	public static void forStar() {

		for (int j = 1; j <= 6; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void whileStar() {
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
