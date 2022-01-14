package com.day18;

// Class클래스
// 특정 클래스나 인터페이스의 '정보'를 검색할 수 있는 메소드를 가지고 있다.

class Test {

	public void write() {

		System.out.println("테스트...");
		
		
	}
}

public class Test1 {

	public static void main(String[] args) throws Exception {

		Class c =  Class.forName("com.day18.Test"); // Class<> 클래스의 모든 정보를 가져와

		Object o = c.newInstance(); // 객체 생성
		
		Test t = (Test)o; // Downcast
		
		t.write(); // 상속 : 부모는 자식것을 가져다 쓸 수 없다
		
		
		
	}

}
