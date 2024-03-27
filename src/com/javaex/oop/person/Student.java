package com.javaex.oop.person;

public class Student extends Person {
	private String schoolName;
	
	public Student(String schoolName) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부보의 기본 생성자 호출
		super("",0);
		this.schoolName = schoolName;
		
	}
	public Student(String name, int age, String schoolName) {
		super(name, age); // 부모 생성자 호출
		this.schoolName = schoolName;
	}
		
	// 객체 초기화
	public String person(String schoolName) {
		return schoolName;
	}
	
	//	✓생성자, getter/setter, showInfo()
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override	// 현재 메서드가 Override 인지 확인
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d, 학교: %s%n", name, age, schoolName);
	}
	

}
