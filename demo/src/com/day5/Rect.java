package com.day5;

import java.util.Scanner;

public class Rect {

	int w, h; // instance ���� (= ���� ����)

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����"); // 10
		w = sc.nextInt();

		System.out.print("����"); // 5
		h = sc.nextInt();

		return; // ���� : ���α׷� �����ٴ� �ǹ� �ƴ�

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

		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + k);
		System.out.println("�ѷ�: " + l);
	}

}
