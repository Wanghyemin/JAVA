package com.day7;

public class Test7 {

	int a = 5; // instance����

	{ // �ʱ�ȭ ��
		System.out.println("�ʱ�ȭ �� a: " + a);
		a = 10;
		System.out.println("�ʱ�ȭ �� a: " + a);
	}

	static int b;
	static { // static ��
		b = 10;
		System.out.println("static �� b: " + b);
	}

	// ����: ���ϴ� ��
	// ���: �׻� ���� ��
	final int C; // ���

	public Test7() {
		System.out.println("������...");
		C = 100;
		System.out.println("C: " + C);
	}

	public static void main(String[] args) {

		Test7 ob1 = new Test7();
		Test7 ob2 = new Test7();
	}

}
