package com.day3;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� �� ¦���� : 2550 Ȧ���� : 2500 �� : 5050
		 */

		int sum1 = 0, sum2 = 0, sum3 = 0;

		for (int i = 1; i <= 100; i += 2) {
			sum1 += i; // Ȧ�� ��
		}

		for (int i = 0; i <= 100; i += 2) {
			sum2 += i; // ¦�� ��
		}

		for (int i = 1; i <= 100; i++) {
			sum3 += i; // ��ü ��
		}

		System.out.printf("Ȧ����: %d, ¦����: %d, ����: %d%n", sum1, sum2, sum3);

		// ������ ���
		
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
		
		System.out.printf("Ȧ����: %d, ¦����: %d, ����: %d", sum1, sum2, sum3);

	}

}
