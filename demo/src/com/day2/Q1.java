package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String str;
		
		System.out.print("���ڸ� �Է��ϼ���");
		num = Integer.parseInt(br.readLine());
		
		str = num%2==0?"¦��":"Ȧ��";
	
		System.out.println( num + ":" + str );
	}

}
