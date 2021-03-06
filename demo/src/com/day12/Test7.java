package com.day12;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector; // ArrayList를 더 많이 쓴다

public class Test7 {

	private static final String[] city = { "서울", "부산", "대구", 
			"인천", "광주", "대전", "울산"};

	public static void main(String[] args) {

		// Generic
		Vector<String> v = new Vector<>();

		String str;

		System.out.println("벡터의 초기 용량: " + v.capacity()); // 10

		for (String s : city) {
			v.add(s);
		}
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {

			str = it.next();
			System.out.print(str + " ");

		}
		System.out.println();

		System.out.println("데이터의 갯수: " + v.size()); // 7

		// 수정
		v.set(0, "Seoul");
		v.set(1, "Pusan");

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 삽입
		v.insertElementAt("대한민국", 0);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());

		// 검색
		int index = v.indexOf("대구"); // 대구가 있는 곳의 index를 가지고 와라
		if (index != -1) {
			System.out.println("검색 성공: " + index);
		} else {
			System.out.println("검색 실패");
		}

		// 오름차순
		Collections.sort(v);

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 내림차순
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 삭제
		/* v.remove(7); */ // 가능
		v.remove("Pusan");

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 용량 증가

		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터의 용량: " + v.capacity()); // 40
		System.out.println("데이터의 갯수: " + v.size()); // 27

		// 범위 삭제
		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("벡터의 용량: " + v.capacity()); // 40 : 자동으로 줄어들지 않는다!
		System.out.println("데이터의 갯수: " + v.size()); // 17

		// 미사용 공간 삭제
		v.trimToSize();
		System.out.println("벡터의 용량: " + v.capacity()); //17
		System.out.println("데이터의 갯수: " + v.size()); //17

		// 모든 데이터 삭제
		v.clear();
		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터의 갯수: " + v.size());

		// 미사용 공간 삭제
		v.trimToSize();
		System.out.println("벡터의 용량: " + v.capacity()); //0
		System.out.println("데이터의 갯수: " + v.size()); //0

	}

}
