package com.day18;

// ClassŬ����
// Ư�� Ŭ������ �������̽��� '����'�� �˻��� �� �ִ� �޼ҵ带 ������ �ִ�.

class Test {

	public void write() {

		System.out.println("�׽�Ʈ...");
		
		
	}
}

public class Test1 {

	public static void main(String[] args) throws Exception {

		Class c =  Class.forName("com.day18.Test"); // Class<> Ŭ������ ��� ������ ������

		Object o = c.newInstance(); // ��ü ����
		
		Test t = (Test)o; // Downcast
		
		t.write(); // ��� : �θ�� �ڽİ��� ������ �� �� ����
		
		
		
	}

}
