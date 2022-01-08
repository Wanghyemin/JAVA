package com.day12;

// 1. ����Ŭ���� (Inner)
// Ŭ���� �ȿ� Ŭ����

class Outer1 {

	static int a = 10;
	int b = 20;

	public class Inner1 { // class �ȿ� class ���� �� �ִ�

		int c = 30;

		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

	public void print() {
		Inner1 ob = new Inner1();
		ob.write();
	}
}

// ������ outer class�� ��ü�� �����ǰ� �� ���� inner class ��ü ���� ����

public class Test1 {

	public static void main(String[] args) {

		Outer1 out = new Outer1();
		out.print(); // ���� �޼ҵ忡�� ��ü�����ϴ� ���
		
		Outer1.Inner1 in = out.new Inner1(); // �ܺΰ�ü�� ���� ���ΰ�ü ��������
		in.write();
		
	}

}