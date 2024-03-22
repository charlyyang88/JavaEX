package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
// 		입력이 없고 출력도 없는 메서드
		printHelloMethod();
		printNumbers();
		getRandomNumber();
		getSum();
//		입력이 있고 출력은 없는 메서드
		printOddOrEven(2024);
		printStringLengh();
//		입력이 있고 출력도 없는 메서드
		int largenum = getLargeNumber(10, 20);
		System.out.println("큰 수는: " + largenum);
		concatenateStrings();
//		가변인자 연습
		sumAll();
		System.out.println("합산된 결과 정수: " + sumAll(1,2,3,4,5));
		System.out.println(concatenateStrings("피", "카", "츄"));
	}

	private static void printHelloMethod() {
//		문제1. 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
//		메서드명 : printHelloMethod
//		입력 : 없음
//		리턴 : 없음
		System.out.println("Hello Method!");
	}
	private static void printNumbers() {
//		문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
//		메서드명 : printNumbers
//		입력 : 없음
//		리턴 : 없음
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
	}
	private static void getRandomNumber() {
//		입력이 없고 출력이 있는 메서드
//		문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
//		메서드명 : getRandomNumber
//		입력 : 없음
//		리턴 : 랜덤한 정수
		System.out.print("\n랜덤숫자: \n");
		System.out.println((int) (Math.random() * 101) + 1); // "\n" + >> 개행시 숫자 범위 벗어남... 이유 아직 모름
	}
	private static void getSum() {
//		문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
//		메서드명 : getSum
//		입력 : 없음
//		리턴 : 계산된 정수
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지 합: " + sum);
	}
	private static void printOddOrEven(int num) {
//		문제5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
//		메서드명 : printOddOrEven
//		입력 : 정수
//		리턴 : 없음
//		System.out.print("정수 입력: ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();

		// 3항 연산 : 조건식 ? 참일 때의 값 : 거짓일때의 값
		System.out.println(num % 2 ==0 ? num + "= 짝수": num + "= 홀수");
		
		//if문 구현
//		if (num % 2 == 0) {
//			System.out.println(" > 짝수");
//		} else {
//			System.out.println(" > 홀수");
//		}
	}
	private static void printStringLengh() {
//		문제6. 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요
//		메서드명 : printStringLengh
//		입력 : 문자열
//		리턴 : 없음
		System.out.print("문자열 입력: ");
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		
		System.out.println("문자열 길이는: "+ letter.length());
	}
	private static int getLargeNumber(int num1, int num2) {
//		문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요
//		메서드명 : getLargeNumber
//		입력 : 두 개의 정수
//		리턴 : 계산된 정수
//		System.out.print("첫 번째 정수 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int num2 = sc.nextInt();
		
//		int result = 0 ;
		
		if ( num1 > num2 ) {
//			result = num1;
			return num1;
		} else {
//			result = num2;
			return num2;
		}
//		System.out.println("큰 수는: " + result);
//		return result;
//		System.out.print("계산된 정수 : ");
	}
	private static String concatenateStrings() {
//		문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
//		메서드명 : concatenateStrings
//		입력 : 두 개의 문자열
//		리턴 : 합쳐진 입력 문자열
		System.out.print("첫 번째 문자열 입력 : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.print("두 번째 문자열 입력 : ");
		String str2 = sc.nextLine();
		
		String sumstr = str1 + str2;
		
		System.out.println("합쳐진 문자열: " + str1 + str2);

		return sumstr;
	
	}
	private static int sumAll(int... values) {
//		문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
//		메서드명 : sumAll
//		입력 : 정해지지 않은 개수의 정수
//		리턴 : 합산된 결과 정수
		int total = 0;
		for ( int val : values) {
			total += val;
		}
		return total;
		
	}
	private static String concatenateStrings(String...values) {
//		문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
//		메서드명 : concatenateStrings
//		입력 : 정해지지 않은 개수의 문자열
//		리턴 : 합쳐진 문자열
		String result = ""; // 문자열 초기화 / null 안됨
		
		for (String val : values) {
			result += val;
		}
		return result;
	}
	
}


