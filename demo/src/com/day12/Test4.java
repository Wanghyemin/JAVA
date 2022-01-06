package com.day12;

// 4. 내부클래스 (익명의, 무명의, Anonymous 클래스)

public class Test4 {

	public Object getTitle() {

		return new Object() {

			@Override
			public String toString() {
				return "익명의 클래스";
			}

		};

	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		Object str =  ob.getTitle();
		System.out.println(str);
	
		
	}

}
