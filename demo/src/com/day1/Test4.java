package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// System.in : Ű����� �Է��� 1byte�� ����
		// InputStreamReader : System.in�� ���� 1Byte�� ����(2Byte)�� ����
		// BufferedReader : �޸𸮻� ���� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double r, area, length;

		System.out.print("������?");

		r = Double.parseDouble(br.readLine());

		area = r * r * 3.14;
		length = r * 2 * 3.14;

		System.out.println("������: " + r);
		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + length);

	}

}
