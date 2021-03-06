package com.day12;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String[] city = { "서울", "부산", "대구",
			"인천", "광주", "대전", "울산"};

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		for (String s : city) {
			v.add(s);
		}

		// v.add(10); String으로 지정해놓아서 Integer는 들어갈 수 없다

		String str;
		str = v.firstElement(); // 메소드 첫번째 값
		System.out.println(str);

		str = v.get(0); // 배열의 0번째 값
		System.out.println(str);

		str = v.get(1);
		System.out.println(str);

		str = v.lastElement();
		System.out.println(str);

		// for
		for (int i = 0; i < v.size(); i++) {

			System.out.print(v.get(i) + " ");
		}

		System.out.println();

		// 확장 for
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// Iterator(반복자) : 데이터가 많으면 많을수록 확장 for문보다 Iterator 쓰기
		// 한 번 데이터를 뽑아내면 그 다음엔 나오지 않는다
		Iterator<String> it = v.iterator();
		while (it.hasNext()) { // hasNext : 다음에 데이터가 있는지 확인하는 메소드

			str = it.next(); // next : read의 의미
			System.out.print(str + " ");

		}

	}
}
