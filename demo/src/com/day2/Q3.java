package com.day2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * 네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용) 
		 * 예) 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20
		 */
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, x;

		System.out.println("number?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if (a < b) {
			x = a;
			a = b;
			b = x;
		}
		if (c < d) {
			x = c;
			c = d;
			d = x;
		}
		if (a < c) {
			x = a;
			a = c;
			c = x;
		}
		if (b < d) {
			x = b;
			b = d;
			d = x;
		}

		System.out.println("Biggest number: " + a + ", Smallest number: " + d);
		
		
		
		// 선생님 풀이
		
		int e,f,g,h,max=0, min=0;
		
		System.out.println("number?");
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		h = sc.nextInt();

		if(e > max)
		max = e;

		if(e < min)
		min =e;

		if(f > max)
		max = f;

		if(f < min)
		min = f;

		if(g > max)
		max = g;

		if(g < min)
		min = g;

		if(h > max)
		max = h;

		if(h < min)
		min = h;
		
		System.out.println("제일 큰 숫자 "+ max +", 제일 작은 숫자 "+ min);
		
	}

}
