package com.javaex.basic.loop;

public class BreakEx {
// 6의배수이자14의배수인가장적은정수찾기
	// 반복 횟수를 정확하게 알기 어려운 경우 -> while
	public static void main(String[] args) {
		int num = 1;

		while (true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
			}
			num += 1;
		}
		System.out.print(num);
	}

}
