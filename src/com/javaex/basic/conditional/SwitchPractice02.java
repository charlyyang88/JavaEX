package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchPractice02 {
	/*
	 * 점수를입력받아등급을표시하는프로그램을작성하세요 90점이상 이면“A등급” 80점이상~89점이면“B등급” 70점이상~79점이면“C등급”
	 * 60점이상~69점이면“D등급” 60점미만이면“F등급
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력 하세요.");
		int score = scanner.nextInt();
		String grade;
		
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A등급";
			break;
		case 8:
			grade = "B등급";
			break;
		case 7:
			grade = "C등급";
			break;
		case 6:
			grade = "D등급";
			break;
		default:
			grade = "F등급";
			break;		
		}
		System.out.println(grade);
		
		
	}

}
