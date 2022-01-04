package com.day10;

// Wrapper 클래스
// 기본 자료형을 클래스로 사용할 수 있게 해줌
// 자료형
// boolean,byte,char,short,int,long,float,double
// Wrapper 클래스
// Boolean, Byte, Character,Short,Integer,Long,Float,Double

//Auto-Boxing (자료형->wrapper클래스로 변환: stack->heap)
//Auto-unBoxing(wrapper클래스->자료형으로 변환: heap->stack)

public class Test1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;

		Integer num1;
		Integer num2 = new Integer(20);

		num1 = n1; // 오토 박싱
		n2 = num2; // 오토 언박싱

		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);

		int a = 24;
		System.out.println(a); // Integer 24
		System.out.println(Integer.toString(a)); // String 24 : 연산 안됌
		System.out.println(Integer.toString(a, 2)); // 2진수 // String 11000
		System.out.println(Integer.toString(a, 16)); // 16진수 // String 18

	}

}


/*  
 
  int a = 10;	4바이트
  float b;		4바이트
  
  f=i; // 10.0	암시적 형변환
  i=f; // X		
  i=(int)f;	// O 명시적 형변환
  
  -----------------------------------------
  
  부모(f) - 자식(i) : 상속
  
  부모(f) = 자식(i);		O	UPCAST 
  자식(i) = 부모(f);		X	
  자식(i) = (자식i)부모(f);	O	DOWNCAST
  
  
  
  
  
  */
  

