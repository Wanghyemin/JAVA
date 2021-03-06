package com.day7;

class RectA {

	private int w, h;

	public RectA() {

	}

	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void set(int w, int h) {

		this.w = w;
		this.h = h;
	}

	public int area() {
		return w * h;
	}

	public int length() {
		return 2 * (w + h);
	}

	public void print(int a) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("면적: " + a);

	}

	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("면적: " + a);
		System.out.println("둘레: " + l);
	}

}

public class Test6 {

	public static void main(String[] args) {

		RectA ob1 = new RectA(); // 기본생성자
		ob1.set(10, 20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);

		System.out.println("-------------------");

		RectA ob2 = new RectA(100, 200); // 오버로딩된 생성자
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);

		// 오버로딩 생성자를 만드는 이유: 기본생성자보다 시간이 빠름
		// 기본생성자만 있을 때, 생략해도 사용할 수 있다.
		// But, 오버로딩 생성자를 적을 때, 기본생성자를 사용하려면 필수적으로 적어줘야 한다.

	}

}
