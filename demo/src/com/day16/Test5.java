package com.day16;

import java.io.FileInputStream;

// 파일 읽어오기
// FileInputStream


public class Test5 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			int data;
			while((data=fis.read())!=-1) {
				/*System.out.print((char)data);*/
				
				System.out.write(data);
				System.out.flush();
				
			}
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
	}

}
