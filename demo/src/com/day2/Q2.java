package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용) 
		 * 예) 20, 30 입력시 -> 큰 숫자 30, 작은 숫자 20
		 */
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("number?");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			System.out.printf("큰 숫자: %d, 작은 숫자: %d", a, b);
		} else {
			System.out.printf("큰 숫자: %d, 작은 숫자: %d", b, a);
		}

	}

}
