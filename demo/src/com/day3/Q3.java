package com.day3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * 3. �μ��� �Է¹޾� ���� ������ ū�������� �� 1~100 ������ �� : 5050
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		int a,b,c,suma,sumb;
		suma = 0;
		sumb = 0;
		
		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b) {
			c=a;
			a=b;
			b=c;
		}
		int i=1;
		while(i<=b) {
			i++;
			sumb=sumb+i;
		}
		
		int j=1;
		while(j<=a) {
			j++;
			suma=suma+j;
		}
		System.out.printf("�� = %d",sumb-suma);
	}

}
