package com.day3;

public class D3 {

	public static void main(String[] args) {

		int i, sum;

		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println(sum);

	}

}
