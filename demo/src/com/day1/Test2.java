package com.day1;

public class Test2 {
	
	public static void main(String[] args) {
	//public static void main1(String[] args) // ��Ÿ�� ���� : �������� ����
		
		// ���� ����
		// int : ����
		
		// '='�� ���� ������ 
		// a��� ���� 10�� �־��
		int a = 10;
		int b = 5;

		int c, d;// '������ ��'�� �������

		System.out.println(a);
		System.out.println(b);
		// System.out.println(c); // ������ ���� : ������ ����, ��Ÿ

		c = a + b;
		System.out.println(c); // 15

		d = a - b;
		System.out.println(d); // 5

		System.out.println(a + "+" + b + "=" + c);
		System.out.println();
		System.out.println(a + "-" + b + "=" + b);

		// format(���) : �ʰ� ����ϰ� ���� ����� �����
		System.out.printf("%d+%d=%d%n", a, b, c);
		System.out.printf("%d - %d = %d\n", a, b, b);

	}	
		
}

	