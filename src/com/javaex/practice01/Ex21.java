package com.javaex.practice01;

public class Ex21 {
//	아래의 출력 결과를 예상하여 작성하고, Ex20 문제와 어떤 부분이 다른지 비교해 보세요
//	(코드를 작성해서 예상과 맞는지 확인해 보세요)
	public static void main(String[] args) {
		int i = 10;
		int n = ++i % 2;

		System.out.println(i);
		System.out.println(n);
	}
}

// Ex20 문제와 차이점 : i의 전치 연산 때문에 1을 먼저 증가(i=11) 시킨 뒤 %연산 
// 결과 예상 : i=11 , n=1
