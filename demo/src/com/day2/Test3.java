package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		// 자료형 char
		// 1byte 1개 혹은 2byte 1개 / 작은따옴표
		char ch, result;

		System.out.print("한개의 문자?");// a(97)

		ch = (char) System.in.read();// 기호: 97

		// System.out.println(ch);//a
		// System.out.println(Integer.toString(ch));//97

		// char 는 숫자연산이 가능하다
		result = ch >= 65 && ch <= 90 ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch);
		System.out.println(ch + ":" + result);
	}

}
