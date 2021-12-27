package com.day3;

public class Test5 {

	public static void main(String[] args) {

		int i, j;

		// 다중 for 문 (나비, 삼각형, 모래시계)
		
		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= 5; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 5; i >= 2; i--) {

			for (j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
