package com.javaex.practice03;

public class Ex09 {
// 다음과 같이 출력하세요
	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++) {
			for (int num = row; num <= row + 9; num++)
				System.out.print(num + "\t");
			System.out.println();
		}
	}

}
