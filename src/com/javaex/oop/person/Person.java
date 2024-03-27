package com.javaex.oop.person;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
