package com.day15;

// 스레드 TTL(Time To Live)

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {
			System.out.println("스레드 시작");

			System.out.println("우선순위: " + getPriority());
			System.out.println("스레드이름: " + getName());

			// 0.5초만 쉬어
			sleep(500);

			// 우선순위 변경
			setPriority(2);
			System.out.println("변경된 우선순위: " + getPriority());

			System.out.println("스레드 종료");

		} catch (Exception e) {

		}

	}
}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // main
		Thread t2 = new MyThread6();

		System.out.println("메인스레드 우선순위: " + t1.getPriority()); // 5
		System.out.println("현재 스레드의 이름: " + t1.getName()); // main
		System.out.println("t2스레드의 이름: " + t2.getName()); // Thread-0

		System.out.println("t2.start() 메소드 호출전의 isAlive: " + t2.isAlive());// false

		t2.start();

		// t2우선순위
		System.out.println("t2 우선순위: " + t2.getPriority());

		// t2의 우선순위 변경
		t2.setPriority(1);

		try {

			// 0.1초
			Thread.sleep(100); // main의 sleep

			// t2 종료 확인
			System.out.println(" t2 살아있냐?" + t2.isAlive()); // true

			// 1초
			Thread.sleep(1000);
			System.out.println("1초 sleep후 t2 살아있냐?" + t2.isAlive()); // false

			t2.join();// t2가 종료할때까지 기다려

			System.out.println("그래도 살아있냐? " + t2.isAlive()); // false : 이미 끝남

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
