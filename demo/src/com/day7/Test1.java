package com.day7;


// this : 클래스 이름 (me)
class Circle {

	private int r; // 정보의 은닉화 (캡슐화)

	public void setData(int r) { //setData(int r,Circle this)
		// 값을 넣을때 쓰는 method = set()
		this.r = r; // 변수의 이름때문에 값의 혼동이 있을때 '지정'해주는 역할
	}

	public double area() { // area(Circle this)
		return r * r * 3.14;
	}

	public void result(double a) { // result(double a, Circle this)
		System.out.println("반지름: " + r);
		System.out.println("넓이: " + a);

	}

}

public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		
		ob.setData(10); // setData(10,ob)
		double a = ob.area(); // ob.area(ob)
		ob.result(a); // result(a,ob)
		
		ob.setData(100);
		a = ob.area(); // a=10인 값을 a=100으로 덮어 쓴다.
		ob.result(a);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
