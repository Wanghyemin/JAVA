package com.day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// �� ���� ���� �Է� �޾Ƽ� ���� ������ ū �� ������ ��� (�������� ����)
		
		//����
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp; // 9 5 2
		
		//�Է�
		System.out.print("num1,num2,num3?");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		//����
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//���
		System.out.println(num1 +","+ num2 +","+ num3); //2 5 9
		System.out.printf("���: %d %d %d",num1,num2,num3);

	}

}
