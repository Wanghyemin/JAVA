package com.day16;

import java.io.IOException;
import java.io.OutputStream;

// out :1바이트로 읽음

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;  
		
		byte[] b = new byte[3]; // Buffer 
		
		// char로 인식하여 아스키로 읽음
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); // 마무리 
		
		System.out.println("나 보이냐?"); //out 이 outputStream가 닫혀서 출력이 되지 않음

	}

}
