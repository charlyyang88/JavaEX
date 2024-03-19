package com.javaex.practice01;

import java.util.Scanner;

public class Ex34 {
//	사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요
	public static void main(String[] args) {
		double f;
		double c;
		
		System.out.print("화씨: ");
		Scanner scanner = new Scanner(System.in);
		f = scanner.nextDouble();
		
		c = (5.0/9.0)*(f-32);
		
		System.out.print("화씨 " + f + "의 섭씨온도는 " + c + "입니다.");
		
	}

}
