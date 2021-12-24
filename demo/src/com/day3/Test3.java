package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n, sum;

		sum = 0;
		// 100까지의 합
		for (n = 1; n <= 100; n++) {
			sum += n;
		}

		sum = 0;
		// 홀수의 합
		for (n = 1; n <= 100; n += 2) {
			sum += n;
		}
		sum = 0;
		// 짝수의 합
		for (n = 0; n <= 100; n += 2) {
			sum += n;
		}
		sum = 0;
		// 3의 배수의 합
		for (n = 0; n <= 100; n += 3) {
			sum += n;
		}

		System.out.println("결과: " + sum);

	}
}
