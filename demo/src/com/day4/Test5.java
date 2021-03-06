package com.day4;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {

		// 1~45까지의 수 중에서 6개의 난수(Random)를 발생시켜 크기 순으로 정렬

		Random rd = new Random();
		int[] num = new int[6];
		int i, j, n, temp;

		n = 0;

		// 1~45
		while (n < 6) {
			num[n] = rd.nextInt(45) + 1;

			// 중복 제거
			for (i = 0; i < n; i++) {
				
				if (num[i] == num[n]) {
					n--;
					break;
				}
			}
			n++;
		}

		// 정렬
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {
				
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
			
		}

		// for (int i=0;i<num.length;i++)
		// 배열에서 사용하는 방식 : num의 개수 n개 만큼 자동으로 가져옴
		// num이 String이면 'for (String a : num)'처럼 사용
		for (int a : num) {
			System.out.printf("%4d", a);

		}
	}

}
