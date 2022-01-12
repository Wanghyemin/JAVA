package com.day15;

// ������ TTL(Time To Live)

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {
			System.out.println("������ ����");

			System.out.println("�켱����: " + getPriority());
			System.out.println("�������̸�: " + getName());

			// 0.5�ʸ� ����
			sleep(500);

			// �켱���� ����
			setPriority(2);
			System.out.println("����� �켱����: " + getPriority());

			System.out.println("������ ����");

		} catch (Exception e) {

		}

	}
}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // main
		Thread t2 = new MyThread6();

		System.out.println("���ν����� �켱����: " + t1.getPriority()); // 5
		System.out.println("���� �������� �̸�: " + t1.getName()); // main
		System.out.println("t2�������� �̸�: " + t2.getName()); // Thread-0

		System.out.println("t2.start() �޼ҵ� ȣ������ isAlive: " + t2.isAlive());// false

		t2.start();

		// t2�켱����
		System.out.println("t2 �켱����: " + t2.getPriority());

		// t2�� �켱���� ����
		t2.setPriority(1);

		try {

			// 0.1��
			Thread.sleep(100); // main�� sleep

			// t2 ���� Ȯ��
			System.out.println(" t2 ����ֳ�?" + t2.isAlive()); // true

			// 1��
			Thread.sleep(1000);
			System.out.println("1�� sleep�� t2 ����ֳ�?" + t2.isAlive()); // false

			t2.join();// t2�� �����Ҷ����� ��ٷ�

			System.out.println("�׷��� ����ֳ�? " + t2.isAlive()); // false : �̹� ����

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
