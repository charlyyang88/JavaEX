package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {
//	사용자의숫자를입력받아더하는프로그램을작성하세요(0이면종료)
	public static void main(String[] args) {
		int total = 0;
		int value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			value = scanner.nextInt();
			total += value;			
			System.out.println("합계:" + total);
		} while (value != 0);
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

}
