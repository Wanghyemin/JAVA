package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아 석차 구하기

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;

		int i, j, inwon;
		String temp;

		do {
			System.out.print("인원수[1~10]?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.print((i + 1) + "번째 이름?");
			name[i] = sc.next();

			System.out.print("점수?");
			score[i] = sc.nextInt();

		}

		// 석차 초기화
		for (i = 0; i < inwon; i++) {
			rank[i] = 1;
		}

		// 석차 계산
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (score[j] > score[i]) {

					rank[i]++;

				} else if (score[j] < score[i]) {

					rank[j]++;
					
				}
			}
		}

		for (i = 0; i < inwon; i++)
			System.out.printf("%6s %4d %4d\n", name[i], score[i], rank[i]);

	}

}
