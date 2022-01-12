package com.score5;

import java.util.Scanner;

import com.score4.ScoreVO;

public class ScoreMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		ScoreVO vo = new ScoreVO();
		Score ob = new Score();

		int ch;

		
		while (true) {

			do {

				System.out.print("1.입력 2.출력 3.종료 :");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.set();
				ob.print();
				break;
			default:
				System.exit(0);

			}

		}

	}

}
