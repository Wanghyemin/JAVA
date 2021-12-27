package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.print("첫번째 수?");// 20
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두번째 수?");// 5
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
		System.out.printf("%d %% %d = %d\t", num1, num2, (num1 % num2));
		// printf" "안에는 %d,%g 등의 값과의 혼동을 줄이기 위해 나머지 %를 %%으로 표기

		// True, False 의 값 도출 : ==,<,>,<=,>=
		System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
		System.out.println(num1 + "=" + num2 + ": " + (num1 == num2));

/////////////////////////////////////////////////////////////////////////////

		// 다중 연산자(조건?true값:false값)
		String str;
		int num3;

		System.out.println("숫자를 입력하세요");
		num3 = Integer.parseInt(br.readLine());

		// 이항 연산자
		str = num3 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num3 + ": " + str);

		str = num3 > 0 ? "양수" : (num3 < 0 ? "음수" : "영");
		System.out.println(num3 + ": " + str);

		// 삼항 연산자
		// A and(&&) B : A도 True이고 B도 True
		// A or(||) B : A만 True 혹은 B만 True, 혹은 둘다 True
		str = (num3 % 4 == 0) && (num3 % 100 != 0) || (num3 % 400 == 0) ? "윤년" : "평년";
		System.out.println(num3 + ": " + str);

	}

}
