package com.day10;

// Wrapper Ŭ����
// �⺻ �ڷ����� Ŭ������ ����� �� �ְ� ����
// �ڷ���
// boolean,byte,char,short,int,long,float,double
// Wrapper Ŭ����
// Boolean, Byte, Character,Short,Integer,Long,Float,Double

//Auto-Boxing (�ڷ���->wrapperŬ������ ��ȯ: stack->heap)
//Auto-unBoxing(wrapperŬ����->�ڷ������� ��ȯ: heap->stack)

public class Test1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;

		Integer num1;
		Integer num2 = new Integer(20);

		num1 = n1; // ���� �ڽ�
		n2 = num2; // ���� ��ڽ�

		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);

		int a = 24;
		System.out.println(a); // Integer 24
		System.out.println(Integer.toString(a)); // String 24 : ���� �ȉ�
		System.out.println(Integer.toString(a, 2)); // 2���� // String 11000
		System.out.println(Integer.toString(a, 16)); // 16���� // String 18

	}

}


/*  
 
  int a = 10;	4����Ʈ
  float b;		4����Ʈ
  
  f=i; // 10.0	�Ͻ��� ����ȯ
  i=f; // X		
  i=(int)f;	// O ����� ����ȯ
  
  -----------------------------------------
  
  �θ�(f) - �ڽ�(i) : ���
  
  �θ�(f) = �ڽ�(i);		O	UPCAST 
  �ڽ�(i) = �θ�(f);		X	
  �ڽ�(i) = (�ڽ�i)�θ�(f);	O	DOWNCAST
  
  
  
  
  
  */
  

