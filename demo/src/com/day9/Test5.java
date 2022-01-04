package com.day9;

public class Test5 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		sb.append("서울");
		sb.append("부산");

		System.out.println(sb); // hashcode나오는게 아니라 String이 나옴

		String str = sb.toString();
		System.out.println(str);

	}

}
