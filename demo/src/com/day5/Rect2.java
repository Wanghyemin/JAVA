package com.day5;

import java.util.Random;
import java.util.Scanner;

public class Rect2 {

	int num[] = new int[5];
	int i, j, temp;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ټ����� ���ڸ� �Է��ϼ���");

		for (i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}

	}

	
	public int array() {

		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num[i];
	}

	
	
	public int tot() {

		int b = 0;
		for (int i = 0; i < 5; i++) {
			b += num[i];
		}
		return b;
	}


	public void print(int a, int b) {
		

		
		System.out.print("��������:");
		for (i = 0; i < 5; i++) {
			a = num[i] ;
			System.out.printf("%4d",a);
		}
		
		System.out.println();
		
		System.out.print("����: "+ b);
	}
}





/*


public void print(int r, int t) {

    for (i = 0; i < 5; i++) {
       System.out.print(num[i] + "  ");
    }
    System.out.println();

    System.out.println(t);
 }





*/











