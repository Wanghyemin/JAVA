package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class D1 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a, b = 0;
		char c;

		while (true) {

			do {
				System.out.print("���ڸ� �Է��ϼ���");
				a = sc.nextInt();
			} while (a < 1 || a > 50);

			for (int i = 1; i <= a; i++) {
				b +=i;
			}

			System.out.println("1~" + a + "������ ��: " + b);
			System.out.println("��� �Ͻðڽ��ϱ�?");
			c = (char) System.in.read();

			if (c !='Y'&& c!='y') {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
