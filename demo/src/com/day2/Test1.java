package com.day2;

public class Test1 {

	public static void main(String[] args) {

		// double과 float의 차이
		float f = 0;
		double d = 0;

		// for(시작값;최대값;증가값)
		// i++ 는 i = i + 1 와 같다.
		// i += 5 는 i = i + 5 와 같다.
		for (int i = 1; i <= 100000; i++) {
			f += 100000;
			d += 100000;
		}
		System.out.println("float: " + (f / 100000));
		System.out.println("double: " + (d / 100000));
	}

}
