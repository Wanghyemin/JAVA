package com.day3;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;

		System.out.print("1-3까지의 숫자를 입력하세요");
		a = sc.nextInt();

		switch (a) {

		case 1:
			System.out.print("a");
			break;
		case 2:
			System.out.print("b");
			break;
		case 3:
			System.out.print("c");
			break;
		default:
			System.out.println("error");
			break;
		}

	}

}
