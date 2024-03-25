package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {
//	아래와 같이 은행 프로그램을 작성하세요
//	“1.예금” 선택 후 금액을 입력하면 예금액이 합산됩니다.
//	“2.출급” 선택 후 금액을 입력하면 예금액이 차감됩니다.
//	“3.잔고” 선택 시 현재 잔고가 출력됩니다.
//	“4.종료” 선택 시 종료됩니다.
//	“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in);
		int balance = 0;
		// 사용자가 종료할때 까지 반복 하도록 세팅
		boolean running = true;

		while (running) {
			System.out.print("선택>");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("예금액>");
				int deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.print("출금액>");
				int withdrawal = sc.nextInt();
				balance -= withdrawal;
				break;
			case 3:
				System.out.print("잔고액>" + balance);
				System.out.println("");
				break;
			case 4:
				System.out.print("프로그램 종료");
				// 반복문 종료
				running = false;
				break;
			default:
				System.out.print("다시입력해주세요");
				break;
			}
		}
		sc.close();
	}
}
