package com.day4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {

		/*
		 * 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ���� (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)
		 */

		/*
		 * ��) �����Է�?[1��°��ȸ] : 3 Ʋ�Ⱦ��!! �����Է�?[2��°��ȸ] : 5 Ʋ�Ⱦ��!! �����Է�?[3��°��ȸ] : 7 Ʋ�Ⱦ��!!
		 * 
		 * ������ 2�Դϴ�
		 * 
		 * ����ҷ�?[Y/N] : ------------------------------ �����Է�?[1��°��ȸ] : 7 Ʋ�Ⱦ��!!
		 * �����Է�?[2��°��ȸ] : 4 Ʋ�Ⱦ��!! �����Է�?[3��°��ȸ] : 9 �¾Ҿ��!!
		 * 
		 * ������ 9�Դϴ�
		 * 
		 * ����ҷ�?[Y/N] :
		 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int[] num = new int[3];
		int a;
		char ch;

		a = rd.nextInt(10) + 1;

		while (true) {

			for (int i = 0; i < 3; i++) {

				System.out.printf("�����Է�?[%d��° ��ȸ]", i + 1);
				num[i] = sc.nextInt();

				if (a == num[i]) {
					System.out.println("�¾Ҿ��!");
					break;
				} else {
					System.out.println("Ʋ�Ⱦ��!");
				}

			}

			System.out.printf("������ %d�Դϴ�.", a);

			System.out.println("��� �ҷ�?[Y/y]");
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y') {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
