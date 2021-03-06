package com.day8;

// 상속 (부모가 자식에게 주는 것)
// 1. 부모꺼는 내꺼다
// 2. private로 선언한 것은 상속 불가능 
// 3. protected로 선언한 것은 상속 가능 (하나의 package안에서 가능)
// 4. 내꺼는 내꺼다. 
// 5. 부모와 자식이 같은 객체를 가지고 있으면 무조건 내꺼 쓴다.  

class TestA {

	private String title;
	private int area;

	public void set(String title, int area) { //메소드로 초기화

		this.title = title;
		this.area = area;

	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class Rect extends TestA { // 상속
	
	private int w,h;
	
	public Rect(int w,int h){ // 생성자로 초기화
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		int a = w*h;
		set("사각형",a);  // 1. 부모꺼는 내꺼다
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {

		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		ob.print(); // 1. 부모꺼는 내꺼다
		
		
	}

}
