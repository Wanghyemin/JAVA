package com.day9;

// String

// String�� Class�̴�(�ڷ����� �ƴ�)
// ������ �����ʹ� ����ϰ� ��� �󵵴� ���� ������ 
// Ŭ������ �ڷ���ó�� ���

// String�����ʹ� equals�� ��
// String�� �Һ��� ��Ģ

public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");

		System.out.println("ob1 == ob2" + (ob1 == ob2)); // True
		System.out.println("ob1 == ob3" + (ob1 == ob3)); // False : ������ ����
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3)); // True

		ob2 = "korea";
		System.out.println("ob1 == ob2" + (ob1 == ob2)); // False

		ob2 = "USA";
		System.out.println("ob1 == ob2" + (ob1 == ob2)); // False

		ob2 = "Seoul";
		System.out.println("ob1 == ob2" + (ob1 == ob2)); // True

		System.out.println(ob2); // hashcode(x)
		System.out.println(ob2.toString());

	}

}