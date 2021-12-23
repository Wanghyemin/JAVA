package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String str;
		
		System.out.print("숫자를 입력하세요");
		num = Integer.parseInt(br.readLine());
		
		str = num%2==0?"짝수":"홀수";
	
		System.out.println( num + ":" + str );
	}

}
