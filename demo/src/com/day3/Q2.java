package com.day3;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 1���� 100������ ���� 3�� ����� ���� 3�� ����� ���� : 33
		 */

		int i, j;

		j = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				j++;
			}
		}
		System.out.println("3�� ����� ���� : " + j);

		
		// �ٸ� Ǯ��
		j = 0;
		for (i = 1; i <= 100; i++) {
			j = i % 3 == 0 ? j+1 : j;
		}
		System.out.println("3�� ����� ���� : " + j);

	}

}
