package com.day3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// switch : 제어문
		
		Scanner sc = new Scanner(System.in);

		int su;

		System.out.print("1~3 이내의 수?");
		su = sc.nextInt();
		
		switch (su) {

		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("숫자입력 오류");
		}

	}

}
