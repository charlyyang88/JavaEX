package com.javaex.practice02;

import java.util.Scanner;

public class Ex17 {
//	다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
//	⚫ 세금계산법
//	⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
//	⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
//	⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
//	⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		double profit = sc.nextDouble();
		double result = 0;
		double tax = 0.09;

		if (profit > 0 && profit <= 1000) {
			result = tax * profit;
			System.out.print("소득세는 " + result + " 입니다.");
		} else if (profit > 1000 && profit <= 4000) {
			result = 1000 * tax + 0.18 * (profit - 1000);
			System.out.print("소득세는 " + result + " 입니다.");
		} else if (profit > 4000 && profit < 8000) {
			result = 1000 * tax + 3000 * 0.18 + 0.27 * (profit - 4000);
			System.out.print("소득세는 " + result + " 입니다.");
		} else if (profit >= 8000) {
			result = 1000 * tax + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (profit - 8000);
			System.out.print("소득세는 " + result + " 입니다.");
		} else {
			System.out.print("잘못 입력했습니다.");
		}
//			System.out.print("소득세는 " + result + " 입니다.");
		// 한 줄로 출력하려면 if 중첩을(=if문 안에서 실행되어야 함) 통해서 해결해야함
		sc.close();
	}
}
