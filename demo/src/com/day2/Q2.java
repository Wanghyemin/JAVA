package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * �� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�) 
		 * ��) 20, 30 �Է½� -> ū ���� 30, ���� ���� 20
		 */
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("number?");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			System.out.printf("ū ����: %d, ���� ����: %d", a, b);
		} else {
			System.out.printf("ū ����: %d, ���� ����: %d", b, a);
		}

	}

}
