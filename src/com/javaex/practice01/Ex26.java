package com.javaex.practice01;

import java.util.Scanner;

public class Ex26 {
// 월급을 입력 받아 1010년동안 최대 저축액을 계산하는 프로그램을 작성하세요
	public static void main(String[] args) {
		double salary=0;
		double total;
		
		System.out.print("월급을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		salary = scanner.nextDouble();
		
		total = salary * (12*10);
		System.out.println("10년동안 최대 저축은 " + total + "원 입니다.");
		
	}

}
