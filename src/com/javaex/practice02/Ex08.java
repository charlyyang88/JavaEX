package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {
// 사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//	프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
	public static void main(String[] args) {
		double h;
		double w;
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해 주세요.");
		System.out.print("키: ");
		h = sc.nextDouble();
		System.out.print("몸무게: ");
		w = sc.nextDouble();

		double bmi;
		bmi = w / (h * h) * 10000;

		if (24.9 >= bmi && bmi >= 18.5) {
			System.out.println("정상체중입니다.");
		} else if (18.5 > bmi) {
			System.out.println("저체중입니다.");
		} else {
			System.out.println("과체중입니다.");
		}
		System.out.println("BMI: " + bmi);
	}
}