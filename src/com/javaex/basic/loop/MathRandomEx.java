package com.javaex.basic.loop;

public class MathRandomEx {
//	•	0.0 이상1.0 미만인실수값반환 (1.0은포함되지않는다)
//	•	double 형값반환
//	•	double 형을int 형으로강제형변환하면소수점아래가버림처리된다.
//	4.175353107765874 → 4
//	•	정수난수값필요시주로사용
	//1~45 까지의숫자중임의의6개의숫자를출력하세요(중복체크는하지말것)
	public static void main(String[] args) {
		int random;
		
		for (int i = 1 ; i <= 6 ; i++) {
//			random = (int)(Math.random()*45)+1;
//			System.out.println(random);
			System.out.print((int)(Math.random()*45)+1 + " ");
		}
		
	}

}
