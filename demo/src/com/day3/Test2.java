package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// while, do-while�� : 1���� �Է��� �������� �հ踦 ���ϱ�

		Scanner sc = new Scanner(System.in);

		int su, sum = 0;
		char ch;

		while (true) {// ���ѷ���

			do {
				System.out.print("���� �Է��ϼ���"); // 100
				su = sc.nextInt();
			} while (su < 1 || su > 5000); // while(�ȵǴ� ���)

			sum = 0;
			for (int i = 1; i <= su; i++) {
				sum += i; 
			}

			System.out.println("1~" + su + "������ ��: " + sum);

			System.out.print("����ҷ�?[Y/N]");//
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y') {
				System.out.print("���α׷� ����");
				break;
			// break�� while,do-while,for,switch���� ��� ����
			}

		}

	}

}
