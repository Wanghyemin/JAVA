package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("�� ���� ���ڸ� �Է��Ͽ���.");

		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b>a){
			c=a;
			a=b;
			b=c;
		}
		
		System.out.printf("ū ���� %d ���� ���� %d",a,b);
		
	}

}
