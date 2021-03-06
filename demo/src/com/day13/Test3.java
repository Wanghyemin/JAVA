package com.day13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		// Set: 중복값을 허용하지 않는다

		Set<String> s = new HashSet<>();

		s.add("서울");
		s.add("부산");
		s.add("대구");

		System.out.println(s);

		s.add("서울"); // 기존의 "서울"에 덮어 씌워진다.만 중요하지 않고 중복이 없다

		System.out.println(s);

		System.out.println("------------------");

		// Stack : 잘 안씀..
		Stack<String> st = new Stack<>();

		st.push("서울");
		st.push("부산");
		st.add("대구");

		while (!st.empty()) { //데이터가 비어있지 않을때까지 = 데이터가 있을때

			System.out.println(st.pop()); // 들어간 것에 역순으로 나온다
		}
		System.out.println("-----------------");
		// Queue
		Queue<String> q = new LinkedList<>();

		q.offer("서울");
		q.offer("부산");
		q.offer("대구");
		q.add("광주");

		while (q.peek() != null) {

			System.out.println(q.poll());
		}
		System.out.println("-----------------");

		List<String> lists1 = new LinkedList<>();
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");

		List<String> lists2 = new LinkedList<>();
		lists2.add("서울");
		lists2.add("부산");
		lists2.add("대구");

		lists2.addAll(lists1);

		System.out.println("lists1............");
		for (String ss : lists1) {
			System.out.println(ss);
		}

		System.out.println("\nlists2............");
		for (String ss : lists2) {
			System.out.println(ss);
		}

		lists2.subList(2, 5).clear();
		System.out.println("\nlists2............");
		for (String ss : lists2) {
			System.out.println(ss);
		}

		String[] str = { "가", "나", "다", "아", "라", "바", "다" };
		for (String ss : str) {
			System.out.print(ss);
		}
		System.out.println();

		Arrays.sort(str);
		for (String ss : str) {
			System.out.print(ss);
		}

	}

}
