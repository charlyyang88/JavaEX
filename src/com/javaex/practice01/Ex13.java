package com.javaex.practice01;

public class Ex13 {
// 다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
	public static void main(String[] args) {
		System.out.println(13/5);					// 1 > 정수 나눗셈이기 때문에 정수 값으로 결과가 나옴. 나머지는 버려지고 몫만 남기 때문에 2가 아닌 1이 출력
		System.out.println((double)13/5);			// 2
		System.out.println(13/(double)5);			// 3
		System.out.println((double)13/(double)5);	// 4
		System.out.println(13.0/5);					// 5
		System.out.println(13/5.0);					// 6
		System.out.println((double)(13/5));			// 7 > 캐스팅 연산자는 13/5의 결과인 정수 값에 대해 적용. 따라서 먼저 정수 나눗셈이 수행되어 결과는 2가 되고, 이후에 실수형으로 캐스팅되어 2.0가 출력.
	}

}
