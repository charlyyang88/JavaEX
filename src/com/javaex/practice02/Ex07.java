package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {
// 나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.print("성인/5000원 입니다.");
		}else if(19 >= age && age >=17){
			System.out.println("고등학생/4000원 입니다.");
		}else if(16 >= age && age >=14){
			System.out.println("중학생/3000원 입니다.");
		}else if(13 >= age && age >=8){
			System.out.println("초등학생/2000원 입니다.");
		}else if(7 >= age && age >=0){
			System.out.println("미취학 아동/무료 입니다.");
		}
		sc.close();
	}

}
