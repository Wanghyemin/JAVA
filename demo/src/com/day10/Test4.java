package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// ����ڿ��� ��,��,���� �Է¹޾� x���� �����(����)
		/*
		 * �⵵?2016 ��?4 ��?20 ������?100
		 * 
		 * �� �� �� : 2016�� 4�� 20�� ������ 100�� �� : 2016�� 7�� 29�� �ݿ���
		 */

		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int y, m, d, x, lastday;
		do {

			System.out.print("����?");
			y = sc.nextInt();

			System.out.print("��?");
			m = sc.nextInt();

			System.out.print("��?");
			d = sc.nextInt();

			System.out.print("x�� ��");
			x = sc.nextInt();

			now.set(y, m - 1, d);
			

			lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			
			System.out.println(lastday);

		} while (y < 1 || m < 1 || m > 12 || d < 1 || d > lastday);

		int w = now.get(Calendar.DAY_OF_WEEK) - 1;

		String[] str = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.printf("�� �� �� : %d�� %d�� %d�� %s���� ", y, m, d, str[w]);

		now.add(Calendar.DAY_OF_MONTH, x);

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println();
		System.out.printf("%d�� �� : %d�� %d�� %d�� %s���� ", x, y, m, d, str[w]);

	}

}