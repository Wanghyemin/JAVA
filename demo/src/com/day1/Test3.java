package com.day1;

public class Test3 {

	public static void main(String[] args) {

		int r = 10;
		float area, lenght;

		// double > float: 3.14로 적으면 double로 인식하여 오류
		area = r * r * 3.14f;
		lenght = r * 2 * 3.14f;

		System.out.println(area);
		System.out.println(lenght);

		System.out.println("반지름: " + r + ", 면적: " + area);
		System.out.printf("반지름: %d, 면적: %.2f", r, area);

	}

}
