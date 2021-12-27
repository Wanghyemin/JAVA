package com.day2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		// Scanner는 단락문자를 구분해서 데이터를 입력
		// 기본 단락은 공백
		System.out.print("이름 국어 영어 수학?");// suzi 40 60 50

		/*
		 * 구분자를 콤마(,)로 하고 싶을 때, 
		 * System.out.print("이름,국어,영어,수학?");// suzi,40,60,50 
		 * 
		 * 정규화표현식 "\\s*빈칸\\s*"가 공식처럼 쓰임 sc = new
		 * Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		 */

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + ": " + (kor + eng + mat) + "점");

	}

}
