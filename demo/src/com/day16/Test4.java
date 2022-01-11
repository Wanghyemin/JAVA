package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamWriter



public class Test4 {

	public static void main(String[] args) throws IOException  {
		
		int data;
		System.out.print("문자열?");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);
		
		
		while((data = rd.read())!=-1) {
			
			wr.write(data);
			wr.flush(); // write 에는 필수적으로 써줘야 함
		}
	}

}
