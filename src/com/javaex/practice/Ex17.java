package com.javaex.practice;

public class Ex17 {
//	다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요
	public static void main(String[] args) {
//		int x,y // 세미콜론 누락
		int x,y;
		
//		x = 10 // 세미콜론 누락
		x = 10;
//		y = 20 // 세미콜론 누락
		y = 20;
		
//		sum = x + y // 선언, 세미콜론, 괄호 누락
		int sum = (x + y);
		
//		System.out.println("합은' + sum); // 큰 따옴표 누락
		System.out.println("합은" + sum);
	}

}
