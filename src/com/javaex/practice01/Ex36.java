package com.javaex.practice01;

import java.util.Scanner;

public class Ex36 {
// 동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요
	public static void main(String[] args) {
		int won500;
		int won100;
		int won50;
		int won10;
		
	
		System.out.print("500원 개수: ");
		Scanner scanner = new Scanner(System.in);
		won500 = scanner.nextInt();
		
		System.out.print("500원 개수: ");
		won100 = scanner.nextInt();
		
		System.out.print("500원 개수: ");
		won50 = scanner.nextInt();
		
		System.out.print("500원 개수: ");
		won10 = scanner.nextInt();
		
		int sum = won500*500+won100*100+won50*50+won10*10;

		System.out.print("동전의 총합은 " + sum + " 원 입니다.");
	}

}
