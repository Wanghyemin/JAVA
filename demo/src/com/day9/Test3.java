package com.day9;

// String

// String은 Class이다(자료형이 아님)
// 저장할 데이터는 방대하고 사용 빈도는 높기 때문에 
// 클래스를 자료형처럼 사용

// String데이터는 equals로 비교
// String은 불변의 법칙

public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");

		System.out.println("ob1 == ob2" + (ob1 == ob2)); // True
		System.out.println("ob1 == ob3" + (ob1 == ob3)); // False : 무조건 복사
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
