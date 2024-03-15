package com.javaex.practice01;

public class Ex16 {
// 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a);	// 4
		System.out.println("b=" + b);	// 2
		System.out.println("x=" + x);	// 2
		System.out.println("y=" + y);	// 2
	}

}
