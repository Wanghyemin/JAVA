package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader
// 1byte Stream을 2byte Stream으로 변화해주는 Stream
// 브릿지 스트림

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("문자열?");
		
		Reader rd = new InputStreamReader(System.in); // 독자적으로 사용이 안되서 Reader사용
		
		while((data = rd.read())!=-1) {
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
		
	}

}
