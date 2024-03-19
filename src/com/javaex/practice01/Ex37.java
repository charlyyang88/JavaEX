package com.javaex.practice01;

import java.util.Scanner;

public class Ex37 {
// 사용자에게 연필의 개수와 인원수를 입력 받아 모든 인원에게 같은 수의 연필을 나눠주려고 한다 1인당 연필의 받을 수 있는 연필의 개수와 나머지를 구하시오
	public static void main(String[] args) {
		int pencil;
		int people;
		
		System.out.print("전체 연필갯수를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		pencil = scanner.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		people = scanner.nextInt();
		
		int sumpencil = pencil/people;
		int remainpencil = pencil%people;
		
		System.out.println("1인당 연필의 갯수는 " + sumpencil + "입니다.");
		System.out.print("연필의 나머지 갯수는" + remainpencil + "입니다.");
	}

}
