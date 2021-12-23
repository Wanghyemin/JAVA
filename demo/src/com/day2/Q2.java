package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("두 개의 숫자를 입력하여라.");

		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b>a){
			c=a;
			a=b;
			b=c;
		}
		
		System.out.printf("큰 숫자 %d 작은 숫자 %d",a,b);
		
	}

}
