package com.day14;

import java.util.Scanner;


class MyAuthExcep {

	public void inputFormat(String str) throws Exception {

		// ���� ����

		if (str.length() < 5 || str.length() > 10) {
			
			throw new Exception("���� ���� ����: " + str);
		}
		
/*		// ������
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch < 'A' || ch > 'Z' ) && (ch < 97 || ch > 122)) {

				throw new Exception("������ ���� �� ����: " + str);

			}

		}*/
		
		
		// ������
		// int ���� boolean���� �� �� ����! boolean�� �� ����
/*		int eng = 0;
		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 97 && ch <= 122)) {
				eng++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			}

		}
		if (eng == 0 || num == 0)

			throw new Exception("������, ���� ȥ�븸 �����մϴ�: " + str);*/
		
		
		boolean eng = false;
		boolean num = false;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 97 && ch <= 122)) {
				eng = true;
			} else if (ch >= '0' && ch <= '9') {
				num = true ;
			}

		}
		if (eng == false || num == false)

			throw new Exception("������, ���� ȥ�븸 �����մϴ�: " + str);

	}

}

public class Test4 {

	public static void main(String[] args) {

		// 5~10�� �̳��� �������� �Է¹޾� ����ϴ� ���α׷�
		// ���ڿ�: abcdefg
		// abcefg

		// ���ڿ�: abc
		// ���ڿ��� ���̴� 5~10�� �Դϴ�

		// ���ڿ�:ab12
		// �����ڸ� �����մϴ�

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthExcep auth = new MyAuthExcep();

		try {
			System.out.println("���ڿ�?");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}