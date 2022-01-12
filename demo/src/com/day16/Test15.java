package com.day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// 객체의 직렬화
// 메모리에 생성된 클래스 객체의 인스턴스 변수의 현재 상태를 
// 그대로 파일에 저장하거나 네트워크를 통해서 전달할 수 있는 기능
// 오로지 바이트 단위로만 데이터를 송수신 할 수 있다.

// 장점은 객체의 내용을 입출력 형식에 구애받지 않고 객체를 
// 파일에 저장함으로써 영속성을 제공할 수 있고 객체 자체를 
// 네트워크를 통해 손쉽게 교환할 수 있게 된다.

// implements Serializable 
// 메소드가 없다

public class Test15 {

	public static void main(String[] args) throws Exception {

		Hashtable<String,String> h = new Hashtable<>();
		
		h.put("1","왕혜민");
		h.put("2", "유인나");
		h.put("3", "정인선");
		
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out6.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);// 직렬화된 데이터를 저장할 수 있다.
		
		oos.writeObject(h);
		oos.close();
		fos.close();
		
		System.out.println("직렬화 데이터 저장 성공");
		//try catch? 왜??
		
		
		
		
		
		
	}

}
