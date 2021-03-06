package com.day11;

import java.util.Calendar;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() {// 기본 생성자

	}

	public TestImpl(String hak, String name, int kor, int eng) { // 오버로딩 생성자 초기화
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	public void set(String hak, String name, int kor, int eng) { // 메소드 초기화

		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		
		//total(); 이렇게 안써도 메소드를 바로 불러올 수 있음
		
		System.out.println(hak + "," + name + "," + total());
	}

	@Override
	public boolean equals(Object ob) { // UPCAST : ob1.equals(TestImpl ob2)

		boolean flag = false;

		if (ob instanceof TestImpl) { // instansceof 원래 자료형을 확인해줌 

			TestImpl t = (TestImpl) ob; // DOWNCAST

			if (this.hak.equals(t.hak) && t.name.equals(this.name)) {
				flag = true;

			}

		}

		return flag;

	}

}

public class Test4 {

	public static void main(String[] args) {

		Test ob1 = new TestImpl("111", "배수지", 80, 90);
		Test ob2 = new TestImpl("111", "배수지", 100, 100);

		if (ob1.equals(ob2)) {
			System.out.println("ob1과 ob2는 동일인물!");
		} else {
			System.out.println("ob1과 ob2는 동일인물 아님!");
		}

		ob1.write();
		ob2.write();
		// ob1.set();
	}

}
