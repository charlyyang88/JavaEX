package com.javaex.practice01;

import java.util.Scanner;

public class Ex29 {
// 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요 너비 높이 변수 double형으로 작성
	public static void main(String[] args) {
		double w;
		double h;
		
		System.out.print("너비를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		w = scanner.nextDouble();

		System.out.print("높이를 입력하세요: ");
		h = scanner.nextDouble();
				
		System.out.print("사각형의 둘레는 " + (h+w)*2);
		System.out.print("사각형의 넓이는 " + h*w);
		
		scanner.close();
	}

}
