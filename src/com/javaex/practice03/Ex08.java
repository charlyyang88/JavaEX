package com.javaex.practice03;

public class Ex08 {
// 아래와 같이 구구단을 출력하세요
	public static void main(String[] args) {
		for (int onetonine = 1; onetonine <= 9; onetonine++) {
			for (int dan = 2; dan <= 9; dan++)
				System.out.print(dan + "*" + onetonine + "=" + dan * onetonine + "\t");
				System.out.println();
		}
	}

}
