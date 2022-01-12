package com.day15;

// 스레드 우선순위
class MyThread4 extends Thread {

	private String name;

	public MyThread4(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
			
			System.out.println(name + ":" + i);
		}
	}
}

public class Test4 {

	public static void main(String[] args) {

		MyThread4 ob1 = new MyThread4("A");
		MyThread4 ob2 = new MyThread4("B");
		MyThread4 ob3 = new MyThread4("C");

		// 우선순의 종류 (1~10)
		System.out.println("Min: " + Thread.MIN_PRIORITY);// 1 (제일 나중에 실행)
		System.out.println("Nor: " + Thread.NORM_PRIORITY);// 5(기본)
		System.out.println("Max: " + Thread.MAX_PRIORITY);// 10 (제일 먼저 실행)
		
		// 기본 스레드의 우선순위
		System.out.println(ob1.getPriority());
		System.out.println(ob2.getPriority());
		System.out.println(ob3.getPriority());
	
		// 우선순위 변경 
		ob1.setPriority(1); //Thread.MIN_PRIORITY 랑 같음
		ob2.setPriority(Thread.NORM_PRIORITY);
		ob3.setPriority(Thread.MAX_PRIORITY);
		
		ob1.start();
		ob2.start();
		ob3.start();
	
	
	}

}
