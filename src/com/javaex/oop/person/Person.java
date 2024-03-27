package com.javaex.oop.person;

public class Person {
	protected String name;
	protected int age;
	
	// 생성자
	public Person(String name, int age) {
		super(); // 부모 클래스 초기화 > 이게 없으면 자식 클래스에서 초기화
		this.name = name;
		this.age = age;
		System.out.println("	Instance Person Constructor ");
	}
	
	
	//	✓생성자, getter/setter, showInfo()
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int Age) {
		this.age = Age;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d%n", name, age);
	}
	
	
	
	
	
}
