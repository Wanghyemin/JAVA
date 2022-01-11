package com.day15;

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() { // Thread method (자바 VM이 호출

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + ":" + name + i);
			i++;

			try {
				sleep(100); // sleep이 반드시 있어야 번갈아 사용함
			} catch (Exception e) {
			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main 시작..");

		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: "); // 실행되는 Thread 개수: 3개

		t1.start();
		t2.start();

		System.out.println("main 종료..");

	}

}
