package com.javaex.practice01;

public class Ex19 {
// 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
	public static void main(String[] args) {
		
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02);
		
		System.out.println(result);
		System.out.println(num01);
		System.out.println(num02);
	}

}

// 결과 값 예상 : 91, 41(후치 연산), 51