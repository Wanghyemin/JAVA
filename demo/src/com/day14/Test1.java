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
		b1.set(10); // auto-boxing : stack������ �ִ� �ڷᰡ heap��������
		int i = b1.get(); // auto-unboxing
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		// b2.set(10); �ڷ����� String�̶� int ����
		b2.set("����");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>();
		b3.set(30);
		Integer ii = (Integer)b3.get(); //downcast
		System.out.println(ii);
		
		
	}

}
