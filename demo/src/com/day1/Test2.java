package com.day1;

public class Test2 {

	// public static void main1(String[] args) // ��Ÿ�� ���� : �������� ����
	public static void main(String[] args) {

		// ���� ����
		// int: ���� / double,float: �Ǽ� / char: ���� ����

		// '='�� ���� ������ ex) a��� ���� 10�� �־��
		int a = 10;
		int b = 5;

		// ���� �������� ������ '������ ��'�� �������
		int c, d;

		System.out.println(a);
		System.out.println(b);
		// System.out.println(c); // ������ ���� : ������ ����, ��Ÿ

		c = a + b;
		System.out.println(c); // 15

		d = a - b;
		System.out.println(d); // 5

		System.out.println(a + "+" + b + "=" + c);
		System.out.println(); // �ٹٲ�
		System.out.println(a + "-" + b + "=" + b);

		// format(���) : �ʰ� ����ϰ� ���� ����� ������
		// %d: ����(integer) / %g: �Ǽ�(double) / %c: ����(character)
		System.out.printf("%d+%d=%d", a, b, c);
		System.out.printf("%d - %d = %d", a, b, d);

	}

}
