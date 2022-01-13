package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���ܸ� �ǵ������� �߻���Ű�� ��� : Test2���� �� ���� ���

public class Test3 {

	public static String getOper() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String oper = null;

		try {

			System.out.print("������?");
			oper = br.readLine();

			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {

				// ����� ���� ���� : ������ ���� �߻�
				throw new Exception("������ �Է� ����"); // Exception�� ��ü����

			}

		} catch (IOException e) {
			System.out.println("�Է¿���");
		}
		return oper;

	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, result;
		String oper;

		try {
			System.out.println("ù��° ��?");
			num1 = Integer.parseInt(br.readLine());

			System.out.println("�ι�° ��?");
			num2 = Integer.parseInt(br.readLine());

			oper = Test3.getOper();

			result = 0;

			if (oper.equals("+")) {
				result = num1 + num2;

			} else if (oper.equals("-")) {
				result = num1 - num2;

			} else if (oper.equals("*")) {
				result = num1 * num2;

			} else if (oper.equals("/")) {
				result = num1 / num2;
			}
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}