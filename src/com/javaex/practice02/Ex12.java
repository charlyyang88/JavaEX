package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {
// 숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
				
		if (num1-num2 < 0 && num1-num3 < 0) {
			System.out.print("가장 작은수는 " + num1 + " 입니다.");
		} else if (num2-num1 < 0 && num2-num3 < 0){
			System.out.print("가장 작은수는 " + num2 + " 입니다.");
		} else {
			System.out.print("가장 작은수는 " + num3 + " 입니다.");
			
		}
	}

}
