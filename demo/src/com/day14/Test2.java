package com.day14;

import java.util.Scanner;

//예외처리
//Exception

public class Test2 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("두개의 수?"); // 10 30
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println("연산자?");
			oper = sc.next();

			result = 0;

			if (oper.equals("+")) {
				result = num1 + num2;

			} else if (oper.equals("-")) {
				result = num1 - num2;

			} else if (oper.equals("*")) {
				result = num1 * num2;

			} else if (oper.equals("/")) {
				result = num1 / num2;
			}
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);

		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해라");
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch (Exception e) { // 예외처리 : IOException의 super격 // catch문에서 Exception이 제일 나중에 나와야 한다.(finally빼고)
			System.out.println("넌 그게 숫자로 보이냐 바보야");
			System.out.println(e.toString()); // 처리한 결과를 보여준다 //java.util.InputMismatchException
			e.printStackTrace(); // 빨간 error 메세지
			
		} finally {
			System.out.println("언제든지 실행된다");
		}
		
		System.out.println("catch문 밖");
	}

}

// 이때까지 쓴 IOException은  전부 try exception안에 묶어도 상관없다
