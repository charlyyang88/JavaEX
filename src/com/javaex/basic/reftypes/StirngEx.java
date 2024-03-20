package com.javaex.basic.reftypes;

public class StirngEx {

	public static void main(String[] args) {
		String str1;	// 선언
		str1 = "Java";	// 할당
		String str2 = "Java";	// 선언과 동시 할당
		String str3 = new String("Java");	// 객체 생성
		
		//	세 참조 변수는 같은 값을 가지고 있다
		//	참조변수의 경우 ==은 메모리 주소를 비교
		System.out.println(str1 == str2); // true 문자로 넣었기 때문에 값이 같으면 같음
		System.out.println(str2 == str3); // false 값은 같으나 주소가 다름
		
		//	값의 비교는 .equals 메서드 이용
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
	}

}
