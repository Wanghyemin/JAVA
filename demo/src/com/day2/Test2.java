package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.print("ù��° ��?");// 20
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ��?");// 5
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
		System.out.printf("%d %% %d = %d\t", num1, num2, (num1 % num2));
		// printf" "�ȿ��� %d,%g ���� ������ ȥ���� ���̱� ���� ������ %�� %%���� ǥ��

		// True, False �� �� ���� : ==,<,>,<=,>=
		System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
		System.out.println(num1 + "=" + num2 + ": " + (num1 == num2));

/////////////////////////////////////////////////////////////////////////////

		// ���� ������(����?true��:false��)
		String str;
		int num3;

		System.out.println("���ڸ� �Է��ϼ���");
		num3 = Integer.parseInt(br.readLine());

		// ���� ������
		str = num3 % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num3 + ": " + str);

		str = num3 > 0 ? "���" : (num3 < 0 ? "����" : "��");
		System.out.println(num3 + ": " + str);

		// ���� ������
		// A and(&&) B : A�� True�̰� B�� True
		// A or(||) B : A�� True Ȥ�� B�� True, Ȥ�� �Ѵ� True
		str = (num3 % 4 == 0) && (num3 % 100 != 0) || (num3 % 400 == 0) ? "����" : "���";
		System.out.println(num3 + ": " + str);

	}

}
