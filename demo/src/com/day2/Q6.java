package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		
/*		이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
		-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		-평균이 60점 미만이면 불합격

		이름 ? 홍길동
		세과목 점수 ? 60 70 80
		이름 : 홍길동
		총점 : 210, 평균 : 70, 판정 :합격*/

		Scanner sc = new Scanner(System.in);
		
		
		int a, b, c, d;
		String name, e;

		System.out.print("이름?");
		name = sc.next();

		System.out.print("점수?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		d = a + b + c;

		if (d >= 180) {
			e = a >= 40 && b >= 40 && c >= 40 ? "합격" : "과락";
		} else {
			e = "불합격";
		}

		System.out.println("이름: " + name + "\n총점: " + d + ", 평균: " + d / 3 + ", 판정: " + e);
		
		
		// 선생님 풀이
		
		if (a >= 40 && b >= 40 && c >= 40 && d >= 180 ) {
			e = "합격";
		}else if(a >= 40 || b >= 40 || c >= 40 && d >= 180) {
			e = "과락";
		}else {
			e = "불합격";
		}

		System.out.println("이름: " + name + "\n총점: " + d + ", 평균: " + d / 3 + ", 판정: " + e);
	}

}
