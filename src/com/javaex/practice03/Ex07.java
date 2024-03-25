package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요");			
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for ( int row = 1; row <= num; row++) {
			for ( int count=0; count <=row; count++)
			System.out.printf("%d%d", row, count);			
			System.out.println();			
		}
		
	}

}
