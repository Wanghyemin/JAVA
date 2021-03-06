package com.day8;

// Call By Value
// Stack 영역에서 Heap영역으로 데이터가 넘어감
// Call By Reference 
// 값을 넘길때 객체의 시작점 주소가 넘어감

class Test {
	
	public int x = 10;

	public void sub(int a) {
		x += a;
	}

}

public class Test1 {

	public static void main(String[] args) {

		Test ob = new Test();
		
		
		// Call By Value 
		
		int a = 20;
		
		System.out.println("sub()메소드 실행전 x: "+ob.x);
		
		ob.sub(a);
		System.out.println("sub()메소드 실행후 x: "+ob.x);
		
		
		// Call By Reference
		
		Test ob1;
		ob1 = ob;
		
		System.out.println(ob.x); //30
		System.out.println(ob1.x); //30
		
		ob1.x = 100;
		
		System.out.println(ob.x); // 100
		System.out.println(ob1.x); //100
		
		
		
	}

}
