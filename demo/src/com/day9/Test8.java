package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Result {

	public void print(String r) {
		System.out.println(r);
	}
}

class Calc extends Result {

	int num1, num2;
	String num;
	char op;

	public void input() throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("두개수");
		num = sc.next();
		String[] ss = num.split(",");
		num1 = Integer.parseInt(ss[0]);
		num2 = Integer.parseInt(ss[1]);

		System.out.println("연산자");
		op = (char) System.in.read();

	}

	public String calc() {
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}

		return String.format("%d %c %d = %d", num1, op, num2, result);
	}

}

public class Test8 {

	public static void main(String[] args) throws IOException {

		Calc ob = new Calc();

		ob.input();
		String r = ob.calc();
		ob.print(r);

	}

}