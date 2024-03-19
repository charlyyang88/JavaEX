package com.javaex.practice01;

import java.util.Scanner;

public class Ex32 {
// 사용자로부터 밑변 높이 값을 입력 받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
	public static void main(String[] args) {
		double w;
		double h;
		
		System.out.print("가로: ");
		Scanner scanner = new Scanner(System.in);
		w = scanner.nextDouble();
		
		System.out.print("세로: ");
		h = scanner.nextDouble();
		
		System.out.print("삼각형의 넓이는 " + (w*h/2));
		
		scanner.close();
	}

}
