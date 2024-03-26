package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {
//	[문제] Ex07 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
//	동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
	public static void main(String[] args) {
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		for (int i = 0; i < wonArray.length ; i++) {
			int countcoin = price/wonArray[i];
			price %= wonArray[i];  // 남은 금액 계산
			System.out.println(wonArray[i] + "원: " + countcoin + "개");
		}
		sc.close();
	}

}
