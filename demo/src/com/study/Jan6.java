package com.study;

import java.util.Scanner;

class Score {

	Scanner sc = new Scanner(System.in);

	public int inwon;
	public String[] name;
	public int[] score;

	public void set() {

		do {
			System.out.print("인원?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		name = new String[inwon];
		score = new int[inwon];
		
		for (int i = 0; i < inwon; i++) {

			System.out.print("이름?");
			name[i] = sc.next();
		
			System.out.print("점수");
			score[i] = sc.nextInt();
		}
	}

	public void input() {

		String temp;
		
		for (int i = 0; i < score.length - 1; i++) {

			for (int j = i + 1; j < score.length; j++) {

				if (score[i] > score[j]) {

					score[i] = score[i] ^ score[j];
					score[j] = score[i] ^ score[j];
					score[i] = score[i] ^ score[j];
					
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}

			}
		}

	}

	public void print() {

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s %d", name[i], score[i]);

			System.out.println();
		}

	}
}

public class Jan6 {

	public static void main(String[] args) {

		Score scr = new Score();
		scr.set();
		scr.input();
		scr.print();

	}

}
