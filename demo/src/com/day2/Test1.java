package com.day2;

public class Test1 {

	public static void main(String[] args) {

		// double�� float�� ����
		float f = 0;
		double d = 0;

		// for(���۰�;�ִ밪;������)
		// i++ �� i = i + 1 �� ����.
		// i += 5 �� i = i + 5 �� ����.
		for (int i = 1; i <= 100000; i++) {
			f += 100000;
			d += 100000;
		}
		System.out.println("float: " + (f / 100000));
		System.out.println("double: " + (d / 100000));
	}

}
