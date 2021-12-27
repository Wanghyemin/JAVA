package com.day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// 세 개의 수를 입력 받아서 작은 수에서 큰 수 순으로 출력 (오름차순 정렬)
		
		//선언
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp; // 9 5 2
		
		//입력
		System.out.print("num1,num2,num3?");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		//연산
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
		
		//출력
		System.out.println(num1 +","+ num2 +","+ num3); //2 5 9
		System.out.printf("결과: %d %d %d",num1,num2,num3);

	}

}
