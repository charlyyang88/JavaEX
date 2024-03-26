package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {
//	[문제] Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i <= 4; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		double avg = (double) sum/i;
		System.out.println("합은 " + sum + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");
		
		sc.close();
	}

}
