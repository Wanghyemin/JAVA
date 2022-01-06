package com.day10;

// Singleton : static써서 주소지 하나로

class Sing {

	private static Sing ob;

	public static Sing getInstance() {

		if (ob == null)
			ob = new Sing();

		return ob;
	}
}

public class Test6 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();

		if (ob1 == ob2) //주소지
			System.out.println("동일한 객체");

	}

}
