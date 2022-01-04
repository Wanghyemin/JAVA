package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 년월을 입력받아 Calendar로 만년달력을 만드세요

		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");

		int y = sc.nextInt();

		System.out.println("월을 입력하세요");
		int m = sc.nextInt();

		now.set(y, m - 1, 1);

		int w = now.get(Calendar.DAY_OF_WEEK)-1;
		int lastday = now.getActualMaximum(Calendar.DATE);
		/* System.out.println(y + "-" + m + "-" + 1 + "-" + w); */

		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		for (int i = 0; i < w; i++) {
			System.out.print("    ");
		}
		for (int j = 1; j <= lastday; j++) {
			System.out.printf("%4d", j);

			w++;
			if (w % 7 == 0) {
				System.out.println();
			}

		}

	}

}
