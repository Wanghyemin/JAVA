package com.day3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * 3. 두수를 입력받아 적은 수에서 큰수까지의 합 1~100 까지의 합 : 5050
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		int a,b,c,suma,sumb;
		suma = 0;
		sumb = 0;
		
		System.out.println("두 개의 숫자를 입력하세요.");
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
		System.out.printf("합 = %d",sumb-suma);
	}

}
