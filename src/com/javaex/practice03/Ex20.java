package com.javaex.practice03;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {
//	아래와 설명에 맞는 프로그램을 작성하세요
//	숨겨진 숫자를 맞추는 게임입니다.
//	프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
//	사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
//	사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
//	정답을 맞춘 경우 “맞았습니다.” 출력됩니다.
//	게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
//	(y 인 경우 다시 게임이 시작됩니다.)
//	*개발시 랜덤하게 생성된 값을 출력해서 테스트 하면 편리합니다.
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("    [숫자 맞추기 게임 시작]   ");
		System.out.println("========================");
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("랜덤 넘버>> " + randomNumber); 	// 테스트용 코드

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("맞춰봐>> ");
			int num = sc.nextInt();

			if (num < randomNumber) {
				System.out.println("더 높게");
			} else if (num > randomNumber) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까?(y/n) >>");
				String userChoice = sc.next();
				if (userChoice.equals("y")) {
					System.out.println("========================");
					System.out.println("    [숫자 맞추기 게임 종료]   ");
					System.out.println("========================");
					break; // 무한 루프 종료
				} else {
					randomNumber = random.nextInt(100) + 1; // 새 게임 시작
				}
			}

		}

	}

}
