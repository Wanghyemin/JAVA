package com.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("서울"); // 입력
		lists.add("부산");
		lists.add("대구");
		
		Iterator<String> it = lists.iterator(); // 데이터 꺼내기 while
		while(it.hasNext()) {
			
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		// ListIterator
		ListIterator<String> it1 = lists.listIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+	" ");
		}
		System.out.println("\n--------------------------");
		
		while(it1.hasPrevious()) { // listiterator : collection 의 기능이 있어 내림차순이 가능하다
			
			System.out.print(it1.previous()+" ");
		}
		System.out.println();
		
		List<String> lists1 = new ArrayList<>();
		lists1.addAll(lists);
		lists1.add("인천");
		
		int n = lists1.indexOf("부산"); // 부산의 인덱스를 찾아서
		lists1.add(n+1,"광주"); // 부산의 인덱스 +1 자리에 광주를 넣어라
		
		for(String s : lists1) {
			
			System.out.print(s+" ");
		}
		
		System.out.println("\n--------------------------");
		
		Iterator<String> it2 = lists1.iterator();
		while(it2.hasNext()) {
			
			String str = it2.next();
			if(str.startsWith("인"))
				System.out.println(str);
		}
		
	}

}
