package com.day15;

class MyThread8 implements Runnable {

	private int bank = 10000;// 잔액

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // bank=bank-m; //인출
		return m; // 인출 금액
	}

	@Override
	public void run() {

		int moneyNeed = 6000; // 인출할 금액
		int money;

		String msg = "";

		try {

			synchronized (this) { // 동기화 블럭

				if (getBank() >= moneyNeed) {
					money = drawMoney(moneyNeed);
					msg = "인출 성공";
				} else {
					money = 0;
					msg = "인출 실패";
				}
			}
			System.out.println(Thread.currentThread().getName() + msg + ", 인출금액: " + money + ", 잔고: " + getBank());

		} catch (Exception e) {
		}

	}
}

public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();

	}

}
