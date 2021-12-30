package com.day7;

//1. static은 new를 사용하지 않아도 알아서 메모리로 올라간다.
//2. static은 객체가 100개 생성되도 메모리 공간은 1개만 생성된다.

public class Test2 {

	public static int a = 10; // class변수 (static포함되면)
	// 클래스 변수 또는 클래스 메소드는 클래스가 로딩되는 순간
	// 메모리 할당이 이루어지면 [클래스이름.객체]를 통해 접근할 수 있다.
	// 즉, new를 통해 메모리 할당을 받지 않아도 사용 가능하다.

	private int b = 20; // instance변수
	// 인스턴스 변수 또는 인스턴스 메소드는 new를 통해 메모리 할당을 받아야만 사용 가능하고,
	// 다른 메소드에서는 접근 가능하지만, 클래스 메소드에서는 접근이 불가능하다.

	public void write() {// instance 메소드
		System.out.println("class 변수 a: "+a);
		System.out.println("instance 변수 b: "+ b);
	}

	public static void print() { // class 메소드
		System.out.println("class 변수 a: "+a);
		// System.out.println("instance 변수 b: "+ b); // 클래스 메소드여서 b가 인식되지 않음
	}

	public static void main(String[] args) { // class 메소드 이지만 특성이 뚜렷하여 main메소드라고 부름!

		System.out.println("class변수 : "+ a); 
		System.out.println("class변수 : "+ Test2.a); // this.a 불가능
		
		//write(); 불가능
		print();
		Test2.print(); // class 메소드
		
		Test2 ob = new Test2();
		System.out.println("class변수 : "+ ob.a); 
		System.out.println("instance 변수 b: "+ ob.b);
		ob.print();
		ob.write();
		System.out.println("------------------------");
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		ob2.write();
		System.out.println("------------------------");
		
		Test2 ob3 = new Test2();
		ob3.a = 1000;
		ob3.b = 2000;
		ob3.write();
		
		System.out.println("------------------------");
		ob.write();
		ob2.write();
		ob3.write();
		
	}

}
