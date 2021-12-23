package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String b;
		
		System.out.print("연도를 입력하세요.");
		a = Integer.parseInt(br.readLine());
		
		b = a%4==0 && a%100!=0 || a%400==0?"윤년":"평년";
		
		System.out.println(a + ":" + b);
		
	}

}
