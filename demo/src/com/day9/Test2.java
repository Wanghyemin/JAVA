package com.day9;

class TestA { // extends Object (deflaut값)

	private int a = 10;

	public void write() {

		System.out.println("a: " + a);
	}

}

public class Test2 {

	public static void main(String[] args) {

		TestA ob1 = new TestA();
		TestA ob2 = new TestA();

		System.out.println("ob1 == ob2: " + (ob1 == ob2)); // false : 주소지 비교

		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2)); // false : equals 는 상속받은 메소드

		System.out.println("ob1: " + ob1); // ob1의 주소지 : hashcode
		System.out.println("ob2: " + ob2); // ob2의 주소지
		System.out.println("ob1.toString(): " + ob1.toString()); // toString는 Object의 메소드를 상속받음 : String으로 바꿔라

	}

}
