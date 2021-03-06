package com.day11;

// Interface
// 추상클래스의 일종으로 선언만 하고 정의(내용=코딩)가 없다.
// 변수는 final 변수만 선언 가능하다
// 인터페이스를 구현하기 위해서는 implements를 사용
// 인터페이스를 구현했으면 인터페이스의 모든 메소드를 재정의(Override) 해야한다.
// 인터페이스가 다른 인터페이스를 상속 받을 수 있다. 그때는 extends를 사용한다. 
// 클래스는 단일 상속이지만 인터페이스는 다중 구현이 가능하다.

interface Fruit {

	String Won = "원"; // public static final 생략

	int getPrice(); // public abstract 생략

	public String getName();

	// public void print(){

	// } 일반 메소드는 못만든당..

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() { // 무조건 오버라이드 해야함
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	public String getItems() { // 자체메소드 생성 가능

		return "과일";

	}

}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();

		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);

		Fruit ob2 = ob1; // UPCAST
		
		System.out.println(ob2.getName()); 
		// System.out.println(ob2.getItem()); // 부모는 getItem이 없다
		
		
	}

}
