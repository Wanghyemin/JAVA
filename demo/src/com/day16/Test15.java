package com.day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// ��ü�� ����ȭ
// �޸𸮿� ������ Ŭ���� ��ü�� �ν��Ͻ� ������ ���� ���¸� 
// �״�� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���ؼ� ������ �� �ִ� ���
// ������ ����Ʈ �����θ� �����͸� �ۼ��� �� �� �ִ�.

// ������ ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ� ��ü�� 
// ���Ͽ� ���������ν� ���Ӽ��� ������ �� �ְ� ��ü ��ü�� 
// ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

// implements Serializable 
// �޼ҵ尡 ����

public class Test15 {

	public static void main(String[] args) throws Exception {

		Hashtable<String,String> h = new Hashtable<>();
		
		h.put("1","������");
		h.put("2", "���γ�");
		h.put("3", "���μ�");
		
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out6.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);// ����ȭ�� �����͸� ������ �� �ִ�.
		
		oos.writeObject(h);
		oos.close();
		fos.close();
		
		System.out.println("����ȭ ������ ���� ����");
		//try catch? ��??
		
		
		
		
		
		
	}

}
