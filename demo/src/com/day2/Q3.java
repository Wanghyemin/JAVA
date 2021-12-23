package com.day1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,x;
		
		System.out.println("number?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a<b) {
			x=a;
			a=b;
			b=x;
		}
		if(c<d) {
			x=c;
			c=d;
			d=x;
		}
		if(a<c) {
			x=a;
			a=c;
			c=x;
		}
		if(b<d) {
			x=b;
			b=d;
			d=x;
		}
		
		System.out.println("Biggest number: "+a+", Smallest number: "+d);
	}

}
