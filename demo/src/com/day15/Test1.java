package com.day15;

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() { // Thread method (�ڹ� VM�� ȣ��

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + ":" + name + i);
			i++;

			try {
				sleep(100); // sleep�� �ݵ�� �־�� ������ �����
			} catch (Exception e) {
			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main ����..");

		MyThread1 t1 = new MyThread1(100, "ù��°: ");
		MyThread1 t2 = new MyThread1(200, "�ι�°: "); // ����Ǵ� Thread ����: 3��

		t1.start();
		t2.start();

		System.out.println("main ����..");

	}

}
