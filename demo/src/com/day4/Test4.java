package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է¹޾�
		// ������ ���� ������� ���� ��� ������ ��� (���� ��������)

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i, j, inwon, temp1;
		String temp2;

		do {
			System.out.print("�� ���� �����͸� �����ž�?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭 �޸� �Ҵ�(��ü ����)
		name = new String[inwon];
		score = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.print("�̸��� ������ �Է��ϼ���");
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		// ���� ����

		for (i = 0; i < score.length - 1; i++) {
			
			for (j = 1; j < score.length; j++) {
				
				if (score[i] < score[j]) {
				
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					
				}

			}
		}

		// ���

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d\n", name[i], score[i]);
		}

	}

}
