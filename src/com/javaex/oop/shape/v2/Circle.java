package com.javaex.oop.shape.v2;
// 인터페이스 내의 모든 추상 메서드는 반드시 구현해야 함
public class Circle extends Shape implements Drawable {
	// 필드
	private double redius;
	
	// 생성자
	public Circle(int x, int y, double redius) {
		// 부모 생성자 호출
		super(x, y);
		this.redius = redius;
	}
	
	// 부모가 선언한 추상메서드는 반드시 구현해야 한다
	@Override
	public double area() {
		double area = Math.PI * Math.pow(redius, 2);
		return 0;
	}
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸어요.%n",
				x, y, redius, area());
	}

}
