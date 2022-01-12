package com.day16;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("d:\\doc\\out5.txt");
			ps = new PrintStream(fos);

			ps.println("이순신");
			ps.println("홍길동");
			ps.println("허준");

			ps.close();
			fos.close();

			fos = new FileOutputStream("d:\\doc\\out5.txt", true); // true : 누적해라
			ps = new PrintStream(fos);

			ps.println("가");
			ps.println("나");
			ps.println("다"); // 덮어씌워짐

			ps.close();
			fos.close();

		} catch (Exception e) {
	
		}

	}

}
