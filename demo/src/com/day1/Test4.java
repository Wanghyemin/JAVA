package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// System.in : 키보드로 입력한 1byte의 문자
		// InputStreamReader : System.in로 읽은 1Byte를 문자(2Byte)로 변경
		// BufferedReader : 메모리상에 저장 공간 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double r, area, length;

		System.out.print("반지름?");

		r = Double.parseDouble(br.readLine());

		area = r * r * 3.14;
		length = r * 2 * 3.14;

		System.out.println("반지름: " + r);
		System.out.println("넓이: " + area);
		System.out.println("둘레: " + length);

	}

}
