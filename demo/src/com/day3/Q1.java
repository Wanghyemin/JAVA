package com.day3;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합 짝수합 : 2550 홀수합 : 2500 합 : 5050
		 */

		int sum1 = 0, sum2 = 0, sum3 = 0;

		for (int i = 1; i <= 100; i += 2) {
			sum1 += i; // 홀수 합
		}

		for (int i = 0; i <= 100; i += 2) {
			sum2 += i; // 짝수 합
		}

		for (int i = 1; i <= 100; i++) {
			sum3 += i; // 전체 합
		}

		System.out.printf("홀수합: %d, 짝수합: %d, 총합: %d%n", sum1, sum2, sum3);

		// 선생님 답안
		
		int i = 0; sum1 = sum2 = sum3 = 0;
		
		while (i < 100) {
			i++;
			
			if (i % 2 == 0) {
				sum2 += i;
			} else if (i % 2 != 0) {
				sum1 += i;
			}
			
			sum3 += i;
		}
		
		System.out.printf("홀수합: %d, 짝수합: %d, 총합: %d", sum1, sum2, sum3);

	}

}
