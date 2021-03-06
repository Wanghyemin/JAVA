package com.day12;

// 1. 내부클래스 (Inner)
// 클래스 안에 클래스

class Outer1 {

	static int a = 10;
	int b = 20;

	public class Inner1 { // class 안에 class 만들 수 있다

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

// 무조건 outer class의 객체가 생성되고 난 다음 inner class 객체 생성 가능

public class Test1 {

	public static void main(String[] args) {

		Outer1 out = new Outer1();
		out.print(); // 내부 메소드에서 객체생성하는 방법
		
		Outer1.Inner1 in = out.new Inner1(); // 외부객체를 통한 내부객체 직접생성
		in.write();
		
	}

}
