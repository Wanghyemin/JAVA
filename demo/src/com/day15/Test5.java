package com.day15;

class MyThread5 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}

}

public class Test5 {

	public static void main(String[] args) {

		System.out.println("main 시작");

		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());

		// 데몬스레드: 다른 스레드에 도움을 주는 스레드로
		// 다른 스레드가 종료되면 데몬스레드가 종료되지 않더라도
		// 프로세스가 종료된다.

		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
		}

		System.out.println("main 종료");
	}

}
