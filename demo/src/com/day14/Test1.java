package com.day14;

class Box<T> {

	private T t;

	public void set(T t) {

		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Test1 {

	public static void main(String[] args) {

		Box<Integer> b1 = new Box<Integer>();
		b1.set(10); // auto-boxing : stack영역에 있는 자료가 heap영역으로
		int i = b1.get(); // auto-unboxing
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		// b2.set(10); 자료형이 String이라 int 못들어감
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>();
		b3.set(30);
		Integer ii = (Integer)b3.get(); //downcast
		System.out.println(ii);
		
		
	}

}
