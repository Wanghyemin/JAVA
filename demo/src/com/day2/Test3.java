package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		// �ڷ��� char
		// 1byte 1�� Ȥ�� 2byte 1�� / ��������ǥ
		char ch, result;

		System.out.print("�Ѱ��� ����?");// a(97)

		ch = (char) System.in.read();// ��ȣ: 97

		// System.out.println(ch);//a
		// System.out.println(Integer.toString(ch));//97

		// char �� ���ڿ����� �����ϴ�
		result = ch >= 65 && ch <= 90 ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch);
		System.out.println(ch + ":" + result);
	}

}
