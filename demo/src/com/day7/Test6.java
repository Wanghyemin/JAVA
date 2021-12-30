package com.day7;

import java.util.Scanner;

class RectA {

	private int w, h;

	public RectA() {

	}

	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void set(int w, int h) {

		this.w = w;
		this.h = h;
	}

	public int area() {
		return w * h;
	}

	public int length() {
		return 2 * (w + h);
	}

	public void print(int a) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);

	}

	public void print(int a, int l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}

}

public class Test6 {

	public static void main(String[] args) {

		RectA ob1 = new RectA(); // �⺻������
		ob1.set(10, 20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);

		System.out.println("-------------------");

		RectA ob2 = new RectA(100, 200); // �����ε��� ������
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);

		// �����ε� �����ڸ� ����� ����: �⺻�����ں��� �ð��� ����
		// �⺻�����ڸ� ���� ��, �����ص� ����� �� �ִ�.
		// But, �����ε� �����ڸ� ���� ��, �⺻�����ڸ� ����Ϸ��� �ʼ������� ������� �Ѵ�.

	}

}