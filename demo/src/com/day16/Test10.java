package com.day16;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out4.txt");

			PrintStream ps = new PrintStream(fos);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("���ڿ�?");
			
			String str;

			while ((str = br.readLine()) != null) {

				ps.println(str);

			}

			ps.close();
			fos.close();

		} catch (Exception e) {
	
		}

	}

}
