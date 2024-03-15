package com.javaex.practice01;

public class Ex24 {
//	다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다
//	결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요
	public static void main(String[] args) {
		double f=80.0;
//		System.out.println(5/9*(f-32.0));
		int c1 = (int) (5.0 / 9.0 * (f-32.0)); // 나눗셈을 먼저 계산하고 결과를 정수로 반환
		System.out.println(c1);
		// or
		double c2 = 5.0 / 9.0 * (f-32.0); // 화씨를 섭씨로 변환하는 공식 사용
		System.out.println(c2);		
	}

}

// 결과값이 0이 나오는 이유 : 정수 나눗셈으로 인해 소수점 이하 자리가 버려지기 때문. 정수끼리의 나눗셈은 정수로 계산되므로 결과가 정수로 반환.
// 따라서 수정된 코드에서는 나눗셈을 먼저 실수로 계산한 후에 정수로 변환하거나, 소수점 이하 값을 포함한 나눗셈을 사용.
