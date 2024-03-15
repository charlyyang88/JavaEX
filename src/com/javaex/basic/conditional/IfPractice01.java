package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfPractice01 {

	// 점수를입력받아입력된수가3의배수인지판별하는프로그램을작성하세요
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 점수 입력
		System.out.println("점수를 입력하세요.");
		int multi3 = scanner.nextInt();
		// 3배수 판별
		if (multi3 %3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		scanner.close();
	}

}
