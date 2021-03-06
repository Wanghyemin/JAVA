package com.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수식[3+5]?"); // 37+23
		String str = br.readLine();

		str = str.replaceAll("\\s", "");

		/*	
		 * String[] oper = {"+","-","*","/"}; 
		 * for(String op : oper) { 
		 * int pos = str.indexOf(op); 
		 * }
		 */

		for (String op : new String[] { "+", "-", "*", "/" }) {
			
			int pos = str.indexOf(op);

			if (pos > -1) {
				int num1 = Integer.parseInt(str.substring(0, pos));
				int num2 = Integer.parseInt(str.substring(pos + 1));

				int result = 0;
				char oper = str.charAt(pos);

				switch (oper) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}

				//System.out.printf("%d %c %d = %d", num1, oper, num2, result);

				String sf = String.format("%d %c %d = %d", num1, oper, num2, result); //sf값을 갖고 다른 곳에서 출력
				System.out.println(sf);
			}

		}
	}

}
