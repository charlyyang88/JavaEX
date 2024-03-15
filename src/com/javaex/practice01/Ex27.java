package com.javaex.practice01;

import java.util.Scanner;

public class Ex27 {
// 반지름을 입력 받아 원의 면적을 구하는 프로그램을 작성하세요 파이 값은 3.143.14로 상수로 지정
	public static void main(String[] args) {
		final double pai = 3.14;
		double r;
		double circle;
		
		System.out.print("반지름을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
		
		circle = r*r*pai;
		System.out.print("원의 넓이는 " + circle);
		
		scanner.close();
	}

}

// push 확인