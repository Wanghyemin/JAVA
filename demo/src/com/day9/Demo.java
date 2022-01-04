package com.day9;

class Test0 {

	private String title;
	protected double area;

	public Test0() {

	}

	public Test0(String title) {

		this.title = title;

	}

	public void write() {
		System.out.println(title + ":" + area);
	}
}

class Circle0 extends Test0 {
	private int r;
	protected static final double PI = 3.14;

	public Circle0(int r) {
		super("��");
		this.r = r;
	}

	public void circleArea() {
		area = (double) r * r * PI;

	}
}

class Rect0 extends Test0 {

	private int w, h;

	public void rectArea(int w, int h) {

		this.w = w;
		this.h = h;

		area = w * h;

	}

	public void write() {
		System.out.println("����: " + w + ", ����: " + h);
		System.out.println("����: " + area);
	}

}

public class Demo {

	public static void main(String[] args) {

		Circle0 ob = new Circle0(10);
		ob.circleArea();
		ob.write();

		Rect0 ob1 = new Rect0();
		ob1.rectArea(10, 20);
		ob1.write();
		
	}
}
