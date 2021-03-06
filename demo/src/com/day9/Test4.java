package com.day9;

// StringBuffer : 동기화 O

// StringBuilder : 동기화 X

public class Test4 {

	public void stringTime() {

		System.out.println("String Test...");

		long start = System.nanoTime();

		String str = "A";
		for (int i = 1; i < 50000; i++) {
			str += "A";

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start));
	}

	public void stringBufferTime() {

		System.out.println("StringBuffer Test...");

		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");
		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start));

	}

	public void stringBuilderTime() {

		System.out.println("StringBuider Test...");

		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");
		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start));

	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}

}
