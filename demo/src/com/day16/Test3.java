package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader
// 1byte Stream�� 2byte Stream���� ��ȭ���ִ� Stream
// �긴�� ��Ʈ��

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("���ڿ�?");
		
		Reader rd = new InputStreamReader(System.in); // ���������� ����� �ȵǼ� Reader���
		
		while((data = rd.read())!=-1) {
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
		
	}

}