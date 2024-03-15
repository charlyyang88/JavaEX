package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;

		// a가 짝수면 "짝수", 홀수면 "홀수"
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "은(는) " + result + " 입니다.");

		int score = 70;
		String message;

		// score 가 80점 이상 : good
		// score 가 50~80점 : pass
		// score 가 50점 미만 : fail

		message = score >= 80 ? "good" : score >= 50 ? "pass" : "fail";
		System.out.println(message);

	}

}
