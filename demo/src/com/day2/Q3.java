package com.day2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * �� ���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�) 
		 * ��) 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20
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
		
		
		
		// ������ Ǯ��
		
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
		
		System.out.println("���� ū ���� "+ max +", ���� ���� ���� "+ min);
		
	}

}
