package com.javaex.practice01;

import java.util.Scanner;

public class Ex28 {
//	원화를 달러화로 계산하는 프로그램을 작성하세요 환율 1달러 = 1230.95원 상수로 지정
	public static void main(String[] args) {
		double won;
		final double dal = 1230.95;
		double total = 0;
		
		System.out.print("환전할 원화를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		won = scanner.nextDouble();
		
		total = won / dal;
		System.out.print("받으실 달러는: " + total);
		
		scanner.close();
	}

}
