package com.javaex.practice04;

public class Ex01 {
// [문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로 확인해 보세요.
	public static void main(String[] args) {
		int[] intArry = new int[5];
		intArry[0] = 3;
		intArry[1] = 7;
		intArry[2] = 12;
		
		int result = 0;
		
		for (int i=0; i <=intArry.length-1; i++) {
		// 배열의 길이를 벗어나지 않게 배열 길이-1을 해줌
			result = result + intArry[i];
		}
		System.out.println(result);
	}

}
