package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class D7 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		double a, b;
		char c;

		System.out.println("두 숫자를 입력하세요");
		a = sc.nextDouble();
		b = sc.nextDouble();

		System.out.println("연산자를 입력하세요");
		c = (char) System.in.read();

		switch (c) {
		case '+':
			System.out.printf("%g+%g=%g", a, b, a + b);
			break;
		case '-':
			System.out.printf("%g+%g=%g", a, b, a - b);
			break;
		case '*':
			System.out.printf("%g+%g=%g", a, b, a * b);
			break;
		case '/':
			System.out.printf("%g+%g=%g", a, b, a / b);
			break;
		default:
			System.out.println("Error");
		}

	}

}
