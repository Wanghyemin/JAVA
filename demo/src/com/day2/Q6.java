package com.day1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		String name, e;

		System.out.print("�̸�?");
		name = sc.next();

		System.out.print("����?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		d = a + b + c;

		if (d >= 180) {
			e = a >= 40 && b >= 40 && c >= 40 ? "�հ�" : "����";
		} else {
			e = "���հ�";
		}

		System.out.println("�̸�: " + name + "\n���� : " + d + ", ���: " + d / 3 + ", ����: " + e);

	}

}