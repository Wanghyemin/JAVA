package com.day6;

public class Demo {
	
	public static int a = 10; 
	
	private int b = 20; 
	
	public void write(){
		System.out.println("class����a: "+a);
		System.out.println("instance���� b: "+b);
	}
	
	public static void print() {
		System.out.println("class ����a: "+a);
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("class����: "+a);
		System.out.println("class����: "+Demo.a);
		
		print();
		Demo.print();
		
		Demo dd = new Demo();
		System.out.println("class ����: "+ dd.a);
		System.out.println("instance ����b: "+dd.b);
		dd.print();
		dd.write();
		
		
		
	}
}