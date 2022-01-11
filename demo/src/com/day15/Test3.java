package com.day15;

import java.util.Calendar;

class MyThread implements Runnable {

	@Override
	public void run() {
		
		while (true) {
			
			System.out.printf("%1$tF %1$tT \n", Calendar.getInstance());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}

public class Test3 {

	public static void main(String[] args) {

		// 현재 시스템의 날짜와 시간을 1초마다 출력하시오

		Thread t1 = new Thread(new MyThread());

		t1.start();

	}

}
