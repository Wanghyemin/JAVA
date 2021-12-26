package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		// for문 : 배열
		// int num[] = new int[5]
		
		int[] num = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print("다섯개의 정수?");// 5 7 9 2 4

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]: " + num[i]);
		}

		System.out.println("배열 갯수: " + num.length);

		
		//num[0]는 변경 가능하며, 연산이 가능하다.
		
		num[3] = 100;
		System.out.println("num[3]: " + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a:"+a);
		
	}
}
