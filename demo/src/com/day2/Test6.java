package com.day2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		// Scanner�� �ܶ����ڸ� �����ؼ� �����͸� �Է�
		// �⺻ �ܶ��� ����
		System.out.print("�̸� ���� ���� ����?");// suzi 40 60 50

		/*
		 * �����ڸ� �޸�(,)�� �ϰ� ���� ��, 
		 * System.out.print("�̸�,����,����,����?");// suzi,40,60,50 
		 * 
		 * ����ȭǥ���� "\\s*��ĭ\\s*"�� ����ó�� ���� sc = new
		 * Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		 */

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + ": " + (kor + eng + mat) + "��");

	}

}
