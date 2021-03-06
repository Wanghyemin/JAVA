package com.day14;

import java.util.Scanner;


class MyAuthExcep {

	public void inputFormat(String str) throws Exception {

		// 문자 길이

		if (str.length() < 5 || str.length() > 10) {
			
			throw new Exception("문자 길이 오류: " + str);
		}
		
/*		// 영문자
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch < 'A' || ch > 'Z' ) && (ch < 97 || ch > 122)) {

				throw new Exception("영문자 외의 값 기입: " + str);

			}

		}*/
		
		
		// 영문자
		// int 말고 boolean으로 쓸 수 있음! boolean이 더 좋음
/*		int eng = 0;
		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 97 && ch <= 122)) {
				eng++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			}

		}
		if (eng == 0 || num == 0)

			throw new Exception("영문자, 숫자 혼용만 가능합니다: " + str);*/
		
		
		boolean eng = false;
		boolean num = false;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 97 && ch <= 122)) {
				eng = true;
			} else if (ch >= '0' && ch <= '9') {
				num = true ;
			}

		}
		if (eng == false || num == false)

			throw new Exception("영문자, 숫자 혼용만 가능합니다: " + str);

	}

}

public class Test4 {

	public static void main(String[] args) {

		// 5~10자 이내의 영문자을 입력받아 출력하는 프로그램
		// 문자열: abcdefg
		// abcefg

		// 문자열: abc
		// 문자열의 길이는 5~10자 입니다

		// 문자열:ab12
		// 영문자만 가능합니다

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthExcep auth = new MyAuthExcep();

		try {
			System.out.println("문자열?");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
