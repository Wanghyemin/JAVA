package com.day15;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

// 정해진 시간마다 특정 작업을 반복해서 실행할 때

public class Test9 extends Thread {

	private int num;

	public Test9() {

		TimerTask task = new TimerTask() {

			@Override
			public void run() {

				// 반복 실행할 작업
				num = 1;

			}
		};

		Timer t = new Timer();
		Calendar c = Calendar.getInstance();
		
		// 내일 0시 0분 0초부터 하루에 한번씩 반복
		/*
		c.add(Calendar.DATE,1);
		c.set(Calendar.HOUR,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		c.set(Calendar.MILLISECOND,0);
		t.schedule(task, c.getTime(),1000*60*60*24); // 밀리세컨*초*분*시
		 */		
		t.schedule(task, c.getTime(),5000);
	}

	@Override
	public void run() {

		while (true) {

			System.out.println(num++);

			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {

		/*Test9 ob = new Test9();
		ob.start();*/
		
		// 위와 같음 : 실행할 메소드가 하나일 때
		new Test9().start();
		
		

	}

}
