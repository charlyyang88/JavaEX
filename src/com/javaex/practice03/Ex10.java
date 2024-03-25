package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
// 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num[] = new int[5];
		
		for (int i=0; i < 5; i++) {
			System.out.print("숫자: ");
			num[i] = sc.nextInt();
		}
		
		// 가장 큰 수를 첫 번째 배열로 초기화
		int bignum = num[0];
		// 배열 1부터 4까지 수를 순차적으로 비교하여 최대값 초기화
		for (int i=1; i<5; i++) {
			if(bignum < num[i])
				bignum = num[i];
		}
		
		System.out.println("최대값은" + bignum + "입니다.");
		sc.close();
	}
}
