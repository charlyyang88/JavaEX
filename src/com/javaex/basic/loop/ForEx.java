package com.javaex.basic.loop;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		int dan;
		dan = scanner.nextInt();
		
		for (int i=1 ; i<10 ; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));			
		}
		scanner.close();
	}

}
