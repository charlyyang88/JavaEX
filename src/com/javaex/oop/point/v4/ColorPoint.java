package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point {
	// 필드
	private String color;
//	ColorPoint cp1 = new ColorPoint("red");
//	ColorPoint cp2 = new ColorPoint(10, 10, "blue");
	// 생성자(기본 생성자가 없으면 자바 컴파일러가 기본 생성자를 추가함)
	public ColorPoint(String color) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부보의 기본 생성자 호출
		super(0, 0); // >> 부모 클래스에서 초기화 되지 않았기 때문에 자식 클래스에서 초기해 해줌, 이때 super() 는 불가
		this.color = color;
		
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모 생성자 호출
		this.color = color;
	}
	
	// getters/setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override	// 현재 메서드가 Override 인지 확인
	public void draw() {
		// getter 이용 우회
//		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다." , super.getX(), super.getY(), color);
		// potected 이용 : 부모 클래스의 필드 영역 변수 제한어 재설정
		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n" , x, y,color);
	}
	
	// void draw(boolean) 오버라이드
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d, 색상=%s]을 ", x, y, color);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
	
}
