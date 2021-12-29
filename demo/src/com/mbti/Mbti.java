package com.mbti;

import java.util.Scanner;

public class Mbti {

	int i, j, inwon;
	RecordM[] r;
	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.print("인원수?");// 3
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		r = new RecordM[inwon];

	}

	public void input() {
		
		for (i = 0; i < inwon; i++) {

			r[i] = new RecordM();
			
			System.out.println("이름?");
			r[i].name = sc.next();

			for (j = 0; j < 4; j++) {

				System.out.printf("%s(1)?,%s(2)?", r[i].a[j], r[i].b[j]);
				r[i].t[j] = sc.nextInt();

			}
		}
	}

	public void print() {

		for (int i = 0; i < inwon; i++) {

			System.out.printf("%6s", r[i].name);
			
			for (int j = 0; j < 4; j++) {

				if (r[i].t[j] == 1) {
					System.out.printf("%3s",r[i].a[j]);
				} else if (r[i].t[j] == 2) {
					System.out.printf("%3s",r[i].b[j]);
				}
			}
			
		System.out.println();
		}
	}
}