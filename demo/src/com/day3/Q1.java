package com.day3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
/*		1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
		¦���� : 2550
		Ȧ���� : 2500
		�� : 5050*/
		
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i =1; i<=100;i+=2 ) {
			sum1 = sum1 + i;
		}
		for(int i =0; i<=100;i+=2 ) {
			sum2 = sum2 + i;
		}
		
		System.out.printf("Ȧ����: %d, ¦����: %d, ����: %d",sum1,sum2,sum1+sum2);
		
		
		

	}

}