package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
//	두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
				
		if (num1-num2 < 0) {
			System.out.print("큰수: " + num2 + "    작은수: " + num1+ " 입니다.");
		} else {
			System.out.print("큰수: " + num1 + "    작은수: " + num2 + " 입니다.");
		}
	}

}
