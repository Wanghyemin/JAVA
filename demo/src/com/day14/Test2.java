package com.day14;

import java.util.Scanner;

//����ó��
//Exception

public class Test2 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("�ΰ��� ��?"); // 10 30
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println("������?");
			oper = sc.next();

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

		} catch (NumberFormatException e) {
			System.out.println("������ �Է��ض�");
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
			
		} catch (Exception e) { // ����ó�� : IOException�� super�� // catch������ Exception�� ���� ���߿� ���;� �Ѵ�.(finally����)
			System.out.println("�� �װ� ���ڷ� ���̳� �ٺ���");
			System.out.println(e.toString()); // ó���� ����� �����ش� //java.util.InputMismatchException
			e.printStackTrace(); // ���� error �޼���
			
		} finally {
			System.out.println("�������� ����ȴ�");
		}
		
		System.out.println("catch�� ��");
	}

}

// �̶����� �� IOException��  ���� try exception�ȿ� ��� �������