package com.day3;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지의 수중 3의 배수의 갯수 3의 배수의 개수 : 33
		 */

		int i, j;

		j = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				j++;
			}
		}
		System.out.println("3의 배수의 개수 : " + j);

		
		// 다른 풀이
		j = 0;
		for (i = 1; i <= 100; i++) {
			j = i % 3 == 0 ? j+1 : j;
		}
		System.out.println("3의 배수의 개수 : " + j);

	}

}
