package com.day3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * 두 수를 입력받아 적은 수에서 큰수까지의 합 1~100 까지의 합 : 5050
		 */

		Scanner sc = new Scanner(System.in);

		int a, b, c, sum;

		sum = 0;

		System.out.println("두 개의 숫자를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();

/*		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
*/
		
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.printf("%d와 %d사이 값들의 합: %d%n", a, b, sum);

		 
		// 다른 풀이
		if (a > b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}

		System.out.printf("%d와 %d사이 값들의 합: %d", a, b, sum);

	}

}
