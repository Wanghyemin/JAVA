package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 예외를 의도적으로 발생시키는 방법 : Test2보다 더 많이 사용

public class Test3 {

	public static String getOper() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String oper = null;

		try {

			System.out.print("연산자?");
			oper = br.readLine();

			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {

				// 사용자 정의 오류 : 강제로 오류 발생
				throw new Exception("연산자 입력 오류"); // Exception의 객체생성

			}

		} catch (IOException e) {
			System.out.println("입력에러");
		}
		return oper;

	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, result;
		String oper;

		try {
			System.out.println("첫번째 수?");
			num1 = Integer.parseInt(br.readLine());

			System.out.println("두번째 수?");
			num2 = Integer.parseInt(br.readLine());

			oper = Test3.getOper();

			result = 0;

			if (oper.equals("+")) {
				result = num1 + num2;

			} else if (oper.equals("-")) {
				result = num1 - num2;

			} else if (oper.equals("*")) {
				result = num1 * num2;

			} else if (oper.equals("/")) {
				result = num1 / num2;
			}
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
