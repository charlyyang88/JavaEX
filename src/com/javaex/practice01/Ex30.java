package com.javaex.practice01;

import java.util.Scanner;

public class Ex30 {
//	마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정
	public static void main(String[] args) {
		final double mile = 1.609;
		double distance;
		
		System.out.print("마일을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		distance = scanner.nextDouble();
		
		System.out.print(distance + "마일은 " + mile*distance + "킬로미터 입니다.");
	}

}
