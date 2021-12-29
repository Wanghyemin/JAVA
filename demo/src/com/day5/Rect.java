package com.day5;

import java.util.Scanner;

public class Rect {

	int w, h; // instance 변수 (= 전역 변수)

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로"); // 10
		w = sc.nextInt();

		System.out.print("세로"); // 5
		h = sc.nextInt();

		return; // 생략 : 프로그램 끝난다는 의미 아님

	}

	public int area() {

		int result;
		result = w * h;

		return result;

	}

	public int length() {

		return (w + h) * 2;

	}

	public void print(int k, int l) {

		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + k);
		System.out.println("둘레: " + l);
	}

}
