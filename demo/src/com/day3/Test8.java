package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		// for�� : �迭
		// int num[] = new int[5]
		
		int[] num = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print("�ټ����� ����?");// 5 7 9 2 4

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]: " + num[i]);
		}

		System.out.println("�迭 ����: " + num.length);

		
		//num[0]�� ���� �����ϸ�, ������ �����ϴ�.
		
		num[3] = 100;
		System.out.println("num[3]: " + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a:"+a);
		
	}
}
