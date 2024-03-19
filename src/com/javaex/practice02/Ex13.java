package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {
// 두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//	(0은 입력하지 않습니다.)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
				
		if (num1-num2 < 0 && num2%num1 == 0) {
			System.out.print(num1 + " 는(은) " + num2 + "의 약수입니다.");
		} else {
			System.out.print(num2 + " 는(은) " + num1 + "의 약수입니다.");
		}
	}
}
