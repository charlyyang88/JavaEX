package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 메세지출력, dan값입력
		System.out.println("단을 입력해주세요.");
		int dan;
		int i = 1;
		dan = scanner.nextInt();
		while (i <= 9) {
			// 구구단출력코드
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i += 1;
		}
		scanner.close();

	}
}
