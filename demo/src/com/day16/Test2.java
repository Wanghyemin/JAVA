package com.day16;

import java.io.IOException;
import java.io.OutputStream;

// out :1����Ʈ�� ����

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;  
		
		byte[] b = new byte[3]; // Buffer 
		
		// char�� �ν��Ͽ� �ƽ�Ű�� ����
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); // ������ 
		
		System.out.println("�� ���̳�?"); //out �� outputStream�� ������ ����� ���� ����

	}

}
