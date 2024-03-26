package com.javaex.practice04;

import java.util.Random;

public class Ex08 {
//	[문제] Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
//	(중복체크 할 것)
	public static void main(String[] args) {
		int[] lottoArr = new int[6];
		Random rd = new Random();

		for (int i = 0; i < 6; i++) {
			int randomNumber;
			boolean duplicated;

			do {
				randomNumber = rd.nextInt(45) + 1;
				duplicated = false;

				// 중복 검사
				for (int j = 0; j < i; j++) {
					if (lottoArr[j] == randomNumber) {
						duplicated = true;
						break;
					}
				}
			} while (duplicated);
			// 중복이 아니면 배열에 할당
			lottoArr[i] = randomNumber;
		}
		// 배열 출력
		for (int num : lottoArr) {
			System.out.print(num + "\t");
		}
	}
}
