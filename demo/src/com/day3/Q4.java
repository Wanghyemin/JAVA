package com.day3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

/*		�������� ����ϼ���*/
			
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		
		for (i=1;i<=9;i++) {
			for(j=2;j<=5;j++) {
				System.out.printf("%d * %d = %d",j,i,i*j);
				System.out.print("		");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (i=1;i<=9;i++) {
			for(j=6;j<=9;j++) {
				System.out.printf("%d * %d = %d",j,i,i*j);
				System.out.print("		");
			}
			System.out.println();
		}
		
		
		
	}

}