package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 정수를 입력 받아서 짝수, 홀수를 구별해서 출력. 
		 * 예) 3 입력시 -> 3 => 홀수 // 4 입력시 -> 4 => 짝수 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String str;

		System.out.print("숫자를 입력하세요");
		num = Integer.parseInt(br.readLine());

		str = num % 2 == 0 ? "짝수" : "홀수";

		System.out.println(num + ": " + str);
	}

}
