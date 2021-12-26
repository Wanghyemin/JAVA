package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// while, do-while문 : 1부터 입력한 수까지의 합계를 구하기

		Scanner sc = new Scanner(System.in);

		int su, sum = 0;
		char ch;

		while (true) {// 무한루프

			do {
				System.out.print("수를 입력하세요"); // 100
				su = sc.nextInt();
			} while (su < 1 || su > 5000); // while(안되는 경우)

			sum = 0;
			for (int i = 1; i <= su; i++) {
				sum += i; 
			}

			System.out.println("1~" + su + "까지의 합: " + sum);

			System.out.print("계속할래?[Y/N]");//
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y') {
				System.out.print("프로그램 종료");
				break;
			// break는 while,do-while,for,switch에서 사용 가능
			}

		}

	}

}
