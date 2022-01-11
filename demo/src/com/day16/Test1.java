package com.day16;

import java.io.IOException;

// Stream
// 데이터 입출력시 모든 데이터를 형태와 관계없이 일련된 흐름으로 전송하는 것

// in : 1바이트로 받음

public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		
		System.out.print("문자 입력: ");
		
		while((data = System.in.read())!=-1) { // System.in.read: 1바이트의 문자 하나
			char ch = (char)data;
			System.out.print(ch);
		
		
		}
	}

}
