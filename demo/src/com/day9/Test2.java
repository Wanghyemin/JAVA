package com.day9;

class TestA { // extends Object (deflaut��)

	private int a = 10;

	public void write() {

		System.out.println("a: " + a);
	}

}

public class Test2 {

	public static void main(String[] args) {

		TestA ob1 = new TestA();
		TestA ob2 = new TestA();

		System.out.println("ob1 == ob2: " + (ob1 == ob2)); // false : �ּ��� ��

		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2)); // false : equals �� ��ӹ��� �޼ҵ�

		System.out.println("ob1: " + ob1); // ob1�� �ּ��� : hashcode
		System.out.println("ob2: " + ob2); // ob2�� �ּ���
		System.out.println("ob1.toString(): " + ob1.toString()); // toString�� Object�� �޼ҵ带 ��ӹ���

	}

}