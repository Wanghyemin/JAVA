package com.day7;


// this : Ŭ���� �̸� (me)
class Circle {

	private int r; // ������ ����ȭ (ĸ��ȭ)

	public void setData(int r) { //setData(int r,Circle this)
		// ���� ������ ���� method = set()
		this.r = r; // ������ �̸������� ���� ȥ���� ������ '����'���ִ� ����
	}

	public double area() { // area(Circle this)
		return r * r * 3.14;
	}

	public void result(double a) { // result(double a, Circle this)
		System.out.println("������: " + r);
		System.out.println("����: " + a);

	}

}

public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		
		ob.setData(10); // setData(10,ob)
		double a = ob.area(); // ob.area(ob)
		ob.result(a); // result(a,ob)
		
		ob.setData(100);
		a = ob.area(); // a=10�� ���� a=100���� ���� ����.
		ob.result(a);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
