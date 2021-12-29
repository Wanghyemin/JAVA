package com.day5;

public class Test6 {

	public static void main(String[] args) {
		// 같은 package안에 있는 Class이므로 import X
		
		// 객체 생성
		Rect r1 = new Rect();
		
		r1.input();
		int a = r1.area();
		int l = r1.length();
		r1.print(a, l);

		Rect r2 = new Rect();
		r2.input();
		int k = r2.area();
		int b = r2.length();
		r2.print(k, b);
	}

}
