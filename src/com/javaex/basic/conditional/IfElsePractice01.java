package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		// 숫자 입력
		// 양수일 때 : 짝수->짝수, 홀수->홀수
		// 음수
		// 0
		
//		int number = -1;
//		String result = (number > 0) ? "양수" : Integer.toString(number);
//		System.out.println(result);
		
		
		Scanner scanner = new Scanner(System.in);

		// 숫자 입력
		System.out.print("숫자입력:");
		int num = scanner.nextInt();

		// 0 소거
		if (num == 0) {
			System.out.println("0입니다.");
		}
		// 음수 소거
		else if (num < 0) {
			System.out.println("음수 입니다.");
		} 
		// 홀짝 분기
		else {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		scanner.close();
	}

}
