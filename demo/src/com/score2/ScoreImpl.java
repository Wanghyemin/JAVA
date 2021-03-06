package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {

		do {
			System.out.print("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	@Override
	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("학번?");
			rec[i].hak = sc.next();

			do {
				System.out.print("이름?");
				rec[i].name = sc.next();
			} while (rec[i].name.length() > 3);

			do {
				System.out.print("국어?");
				rec[i].kor = sc.nextInt();
			} while (rec[i].kor < 1 || rec[i].kor > 100);

			do {
				System.out.print("영어?");
				rec[i].eng = sc.nextInt();
			} while (rec[i].eng < 1 || rec[i].eng > 100);

			do {
				System.out.print("수학?");
				rec[i].mat = sc.nextInt();
			} while (rec[i].mat < 1 || rec[i].mat > 100);

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;

			rec[i].ave = rec[i].tot / 3;

		}

	}

	private String panjung(int score) {

		String pan = "";

		switch (score / 10) {
		case 10:
		case 9:
			pan = "A";
			break;
		case 8:
			pan = "B";
			break;
		case 7:
			pan = "C";
			break;
		case 6:
			pan = "D";
			break;
		default:
			pan = "F";
			break;
		}

		return pan;

	}

	@Override
	public void print() {

		for (int i = 0; i < inwon; i++) {

			System.out.printf("%6s %4s %4d(%s) %4d(%s) %4d(%s) %4d %4d", 
					rec[i].hak, rec[i].name, 
					rec[i].kor,	panjung(rec[i].kor), 
					rec[i].eng, panjung(rec[i].eng), 
					rec[i].mat, panjung(rec[i].mat), 
					rec[i].tot,	rec[i].ave);
			System.out.println();
		}

		// 111 suzi 80(B) 40(F) 60(D) xxx xxx
	}

}