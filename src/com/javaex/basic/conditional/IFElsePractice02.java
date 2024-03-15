package com.javaex.basic.conditional;

import java.util.Scanner;

public class IFElsePractice02 {

	public static void main(String[] args) {
		// 과목번호 입력
		// 1: R101
		// 2: R202
		// 3: R303
		// 4: R404
		// 나머지 : 상담원에게 문의하세요
		Scanner scanner = new Scanner(System.in);

		System.out.print("과목 번호입력:");
		int educode = scanner.nextInt();

		if (educode == 1) {
			System.out.println("R101");
		} else {
			if (educode == 2) {
				System.out.println("R202");
			} else {
				if (educode == 3) {
					System.out.println("R303");
				} else {
					if (educode == 4) {
						System.out.println("R404");
					} else {
						System.out.println("상담원에게 문의하세요");
					}

				}
			}
		}
		scanner.close();
	}
}
