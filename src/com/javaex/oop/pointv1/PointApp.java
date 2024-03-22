package com.javaex.oop.pointv1;

public class PointApp {
	
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(5);
		point1.setY(5);
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		
		point1.draw();
		point2.draw();
//		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", point1.getX(), point1.getY());
//		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", point2.getX(), point2.getY());
		
	}

}
