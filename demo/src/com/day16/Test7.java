package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test7 {

	public static void main(String[] args) {

		// 파일 복사
		// 원본 파일? d:\\doc\\test.txt
		// 대상 파일? d:\\doc\\out2.txt
		// 복사 완료

		try {

			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out2.txt");

			int data;
			while ((data = fis.read()) != -1) {

				/*System.out.write(data);*/

				fos.write(data); // 보내는애
				fos.flush();

			}
			
			fis.close();
			fos.close();
			System.out.println("완료되었습니다:)");
			
		} catch (Exception e) {
			
		}

	}

}
