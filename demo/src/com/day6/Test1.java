package com.day6;

class SubClass {

	int a; // instance 변수 (전역 변수)
	int b;

}

public class Test1 {

	public static void main(String[] args) {

		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();

		System.out.println("ob1.a: " + ob1.a); // 초기값 = 0
		System.out.println("ob1.b: " + ob1.b); // 초기값 = 0

		ob1.a = 10;
		ob1.b = 20;

		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
		System.out.print("---------------------");

		System.out.println("ob2.a: " + ob2.a); // 초기값 = 0
		System.out.println("ob2.b: " + ob2.b); // 초기값 = 0

		ob2.a = 100;
		ob2.b = 200;

		System.out.println("ob2.a: " + ob2.a);
		System.out.println("ob2.b: " + ob2.b);

		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);

	}
}
