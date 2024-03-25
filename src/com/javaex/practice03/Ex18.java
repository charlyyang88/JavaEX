package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {
// 숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for (int row = 1; row <= num; row++) {
			for (int i = num; i >= row; i--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int row = 2; row <= num; row++) {
			for (int i = 1; i <= row; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}
