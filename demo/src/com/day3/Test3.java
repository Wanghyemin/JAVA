package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n, sum;

		// for 문 
		
		// 100까지의 합
		sum = 0;
		for (n = 1; n <= 100; n++) {
			sum += n;
		}

		// 홀수의 합
		sum = 0;
		for (n = 1; n <= 100; n += 2) {
			sum += n;
		}
		
		// 짝수의 합
		sum = 0;
		for (n = 0; n <= 100; n += 2) {
			sum += n;
		}
		
		// 3의 배수의 합
		sum = 0;
		for (n = 0; n <= 100; n += 3) {
			sum += n;
		}

		System.out.println("결과: " + sum);

	}
}
