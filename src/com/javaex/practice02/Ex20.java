package com.javaex.practice02;

import java.util.Scanner;

public class Ex20 {
//	알파벳을 입력 받아 자음 모음을 구분하세요.
//	⚫ if~else문을 사용합니다.
//	⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char alpabet = sc.next().charAt(0);
		char vowel1 = 'a';
		char vowel2 = 'e';
		char vowel3 = 'i';
		char vowel4 = 'o';
		char vowel5 = 'u';
		
		if(alpabet==vowel1 || alpabet==vowel2 || alpabet==vowel3 || alpabet==vowel4 || alpabet==vowel5) {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}
	}

}
