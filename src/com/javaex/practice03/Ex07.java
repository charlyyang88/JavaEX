package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
// 숫자를 입력 받아 아래와 같이 출력하세요
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요");			
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for ( int row = 1; row <= num; row++) {
			for ( int count=1; count <=row; count++)
			System.out.print(row);			
			System.out.println();			
		}
		sc.close();
	}

}
