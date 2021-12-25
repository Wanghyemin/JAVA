package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class D1 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a, b = 0;
		char c;

		while (true) {

			do {
				System.out.print("숫자를 입력하세요");
				a = sc.nextInt();
			} while (a < 1 || a > 50);

			for (int i = 1; i <= a; i++) {
				b +=i;
			}

			System.out.println("1~" + a + "까지의 합: " + b);
			System.out.println("계속 하시겠습니까?");
			c = (char) System.in.read();

			if (c !='Y'&& c!='y') {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
