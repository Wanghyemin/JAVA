package com.day11;

class TestA {
	public void print() {
		System.out.println("A클래스...");
	}
}

class TestB {
	public void print() {
		System.out.println("B클래스...");
	}
}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		
		//b = a; // 자료형이 달라서 불가능 (암시적)
		
		//b = (TestB)a; // 명시적 형변환 (X)
		
		
	
	}

}
