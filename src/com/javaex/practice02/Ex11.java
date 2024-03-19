package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {
// 두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번재 숫자: ");
		int num2 = sc.nextInt();
				
		if (num1-num2 < 0) {
			System.out.print("몫: " + num2/num1 + "\n나머지: " + num2%num1);
		} else {
			System.out.print("몫: " + num1/num2 + "\n나머지: " + num1%num2);
		}
	}

}
