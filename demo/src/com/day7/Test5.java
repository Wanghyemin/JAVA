package com.day7;

// 생성자
// 만드는 이유
// 1. 객체 생성, 2. 변수 초기화 목적 
// 메모리 할당을 받을 때 사용을 하고
// 생성자는 class의 이름과 동일하다.
// 리턴값이 없기 때문에 property가 필요 없다.
// 생성자는 중복정의(Overloading)가 가능하다.
// 생성자 안에서 다른 생성자를 호출할 수 있다.
// 단, 호출시 제일 선두에서만 호출 가능하다. 

public class Test5 {
	
	private int x;
	
	public Test5() {//기본 생성자 (생략) // 생성자는 class이름과 동일하다
		
		this(50); // 호출시 제일 선두에서만 호출 가능하다.
		System.out.println("기본 생성자...??");
		x = 10;
		System.out.println("x: "+x);
	
	}

	public Test5(int x) { // 생성자는 중복정의가 가능하다.
		
		System.out.println("오버로딩된 생성자...");
		this.x = x;
		System.out.println("x: "+x);
	}
	
	public static void main(String[] args) {

		Test5 ob1 = new Test5();
		Test5 ob2 = new Test5(50);
		
		
		
		
		
		
	}

}
