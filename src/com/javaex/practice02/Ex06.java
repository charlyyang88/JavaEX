package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {
//나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을 작성하세요.
	
	public static void main(String[] args) {
	
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		if(65 > age && age > 19) {
			System.out.print("\"1번그룹\"");
		}else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		sc.close();
	}

}
