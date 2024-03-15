package com.javaex.practice01;

public class Ex20 {
//	아래의 출력결과를 예상하여 작성하세요
//	(	코드를 작성해서 예상과 맞는지 확인해 보세요)
	public static void main(String[] args) {
		int i = 10;
		int n = i++ %2;
				
		System.out.println(i);
		System.out.println(n);
	}

}

// 결과 예상 : i=11 , n=0 >> i의 후치 연산 때문
