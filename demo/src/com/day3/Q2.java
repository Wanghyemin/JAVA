package com.day3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 1���� 100������ ���� 3�� ����� ���� 3�� ����� ���� : 33
		 */

		Scanner sc = new Scanner(System.in);

		int i, sum;

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum++;
			}
		}
		
		
		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum = i%3==0?sum++:sum;
			}
		}

		
		

		System.out.println("3�� ����� ���� : " + sum);

	}

}
