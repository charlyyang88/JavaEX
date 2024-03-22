package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400_000);

		Goods pc = new Goods();
		pc.setName("LG그램");
		pc.setPrice(900_000);

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2_000);

		// 상품 정보 출력(getter 활용)
//		System.out.println(camera.name + "  " + camera.price + "원");
		System.out.printf("%s, %,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("%s, %,d원%n", pc.getName(), pc.getPrice());
		System.out.printf("%s, %,d원%n", cup.getName(), cup.getPrice());

		// 상품 정보 출력(메서드 활용)
		camera.showInfo();
		pc.showInfo();
		cup.showInfo();
	}

}
