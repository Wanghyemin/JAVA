package com.day10;

class Test {

	protected int a = 10, b = 20;

	public void write() {

		System.out.println("Super Class write()...");
		System.out.println("a: " + a + ", b: " + b);

	}

}

class Demo extends Test {

	protected int b = 30, c = 40;

	@Override
	public void write() {
		System.out.println("Sub Class write()...");
		System.out.println("a: " + a + ",b: " + b + " ,c:" + c); // 10 30 40
		System.out.println("super.b: " + super.b); // 20
	}

	public void print1() {

		System.out.println("Sub Class print1()에서 write()호출... ");
		write(); // 자식
	}

	public void print2() {

		System.out.println("Sub Class print2()에서 write()호출... ");
		super.write(); // 부모
	}
}

public class Test5 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.write();
		ob.print1(); //10 30 40
		ob.print2(); //10 20
		
		// System.out.println(super.b); 
		System.out.println("ob.b: "+ ob.b);
		System.out.println("((Test)ob).b: "+ ((Test)ob).b); //20
		System.out.println("------------------------");
		((Test)ob).write(); // 10 30 40 메소드는 부모의 탈을 썼어도 무조건 자식의 것을 찍어놓는다
		
		
		
		
		
		
		
	}

}
