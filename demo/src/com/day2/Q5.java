package com.day2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
/*		�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
		�������� ������ �����ϴ�.
		10�� �̻� -> 10%
		20�� �̻� -> 15%
		30�� �̻� -> 20%
		�Ǹűݾ��� ����غ��ϴ�.
		��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��*/

		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		
		System.out.println("�����Ͻ� ������ ������ �����ÿ�.");
		a = sc.nextInt();
		
		if(a<10) {
			b = a*15800;
		}else if (a<20){
			b = a*15800*0.9;
		}else if (a<30){
			b = a*15800*0.85;
		}else {
			b = a*15800*0.8;
		}
		
		System.out.printf("���Լ���: %d��, �Ǹ��ѱݾ�: %g��",a,b);
	
	}

}
