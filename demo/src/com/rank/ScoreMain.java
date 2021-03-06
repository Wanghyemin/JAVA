package com.rank;

import java.util.Scanner;

class Record {

	String name;
	int[] score = new int[3];
	String[] score1 = new String[3];
	int tot, ave;
}

class Score {

	Scanner sc = new Scanner(System.in);
	Record[] re;
	int inwon, i, j;

	public void set() {

		do {
			System.out.println("인원을 입력하세요.");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);
		re = new Record[inwon];
	}

	public void input() {

		String[] title = { "국어?", "영어?", "수학?" };

		for (i = 0; i < inwon; i++) {

			re[i] = new Record();

			System.out.println("이름을 입력하세요");
			re[i].name = sc.next();

			for (j = 0; j < 3; j++) {

				System.out.println(title[j]);

				re[i].score[j] = sc.nextInt();
				
				re[i].tot += re[i].score[j];

			}

			re[i].ave = re[i].tot / 3;

		}

	}

	private void score1() {

		for (i = 0; i < inwon; i++) {

			for (j = 0; j < 3; j++) {

				if (re[i].score[j] > 90) {
					re[i].score1[j] = "수";
				} else if (re[i].score[j] > 80) {
					re[i].score1[j] = "우";
				} else if (re[i].score[j] > 70) {
					re[i].score1[j] = "미";
				} else if (re[i].score[j] > 60) {
					re[i].score1[j] = "양";
				} else {
					re[i].score1[j] = "가";
				}
			}
		}

	}

	public void print() {

		score1();

		for (i = 0; i < inwon; i++) {

			System.out.printf("%6s ", re[i].name);

			for (j = 0; j < 3; j++) {

				System.out.printf("%4d", re[i].score[j]);
				System.out.printf("(%s)", re[i].score1[j]);
			}

			System.out.printf("%4d", re[i].tot);
			System.out.printf("%4d", re[i].ave);
		
		}
		System.out.println();
	}

}

public class ScoreMain  {

	public static void main(String[] args) {

		Score s = new Score();

		s.set();
		s.input();
		s.print();

	}

}
