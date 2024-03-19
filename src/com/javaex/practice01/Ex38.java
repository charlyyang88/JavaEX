package com.javaex.practice01;

import java.util.Scanner;

public class Ex38 {
// 총 금액을 입력하면 백원단위는 할인을 해주고 있습니다 실제 지불금액을 출력하는 코드를 작성하세요
	public static void main(String[] args) {
		int price;
		
		System.out.print("전체금액을 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		price = scanner.nextInt();
		
		int pay = price/1000*1000;
		
		System.out.print("실제지불금액은 " + pay + "입니다.");
		
	}

}
