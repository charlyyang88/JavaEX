package com.javaex.practice01;

import java.util.Scanner;

public class Ex33 {
// 사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요
	public static void main(String[] args) {
		double v;
		final double pi = 3.14;
		double r;
		
		System.out.print("반지름: ");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
		v = (((4.0/3.0)*pi)*(r*r*r)); // 부피를 계산할 때 소수점 이하 값이 필요하기 때문에 실수 나눗셈을 사용
		
		System.out.print("구의 부피는: " + v + "입니다.");
		
		scanner.close();
		
	}

}
