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

		// ���� �ý����� ��¥�� �ð��� 1�ʸ��� ����Ͻÿ�

		Thread t1 = new Thread(new MyThread());

		t1.start();

	}

}
