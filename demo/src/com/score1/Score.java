package com.score1;

import java.util.Scanner;

public class Score {

	/*
	 * int[] inwon; // int[0],int[1], ... Record[] rec; // Record[0],Record[1]...
	 */

	int inwon; // 단일 값
	Record[] rec; // Record는 Class이고 Record 안에 있는 여러 값을 가져올 수 있다?\

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.print("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	public void input() {

		String[] title = { "국어?", "영어?", "수학?" };

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.println("이름?");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {

				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];

			}

			rec[i].ave = rec[i].tot / 3;

		}

	}

	private void ranking() { //외부 출입 제한 : 같은 Class 안의 Method에서는 호출 가능

		int i, j;
		for (i = 0; i < inwon; i++) {

			rec[i].rank = 1;
		}
		for (i = 0; i < inwon-1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				} else if (rec[i].tot < rec[j].tot) {
					rec[i].rank++;
				}
			}
		}
	}

	public void print() {
		
		ranking();

		for (int i = 0; i < inwon; i++) {

			System.out.printf("%6s ", rec[i].name);

			for (int j = 0; j < 3; j++) {

				System.out.printf("%4d", rec[i].score[j]);

			}

			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].ave);
			System.out.printf("%4d\n", rec[i].rank);

		}

	}

}
