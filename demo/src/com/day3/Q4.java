package com.day3;

public class Q4 {

	public static void main(String[] args) {

		/* 구구단을 출력하세요 */

		// 내가 한 방법
		
		int i, j;

		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 5; j++) {
				System.out.printf("%d * %d = %d", j, i, i * j);
				System.out.print("		");
			}
			System.out.println();
		}

		System.out.println("\n");

		for (i = 1; i <= 9; i++) {
			for (j = 6; j <= 9; j++) {
				System.out.printf("%d * %d = %d", j, i, i * j);
				System.out.print("		");
			}
			System.out.println();
		}

		
	
		// 선생님 방법 (1)
		
/*		int i, j, k, n = 2, m = 5;

		for (i = 0; i <= 1; i++) {

			for (j = 1; j <= 9; j++) {

				for (k = n; k <= m; k++) {
					System.out.print(k + "*" + j + "=" + (k * j) + "\t");
				}

				System.out.println(); // 가로로 2~6단 *1 찍고 줄바꿈
			}
			System.out.println(); // 세로로 * 1~9 찍고 줄바꿈
			n = 6;
			m = 9;
		}
*/
		
/*
		// 선생님 방법 (2)

		int i,j,k;

		for(i=2;i<=6;i+=4){
				
			for(j=1;j<=9;j++){
					
				for(k=i;k<=(i+3);k++){
				
						System.out.print(k+"*"+j+"="+(k*j)+"\t");
				}

			System.out.println(); //4개 찍고 줄바꿈
			}
			
			System.out.println(); //6단부터 줄바꿈
				
		}
*/
		
/*
		// 선생님 방법 (3)

		int i, j, dan;

		for (int k = 0; k < 2; k++) {

			for (i = 1; i <= 9; i++) {

				for (j = 2; j <= 5; j++) {

					dan = j + k * 4;
					System.out.printf("%2d*%2d=%2d\t", dan, i, dan * i);
				}

				System.out.println(); // 4개 찍고 줄바꿈
			}
			System.out.println(); // 6단부터 줄바꿈

		}
*/

	}

}
