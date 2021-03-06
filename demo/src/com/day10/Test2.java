package com.day10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		// Calendar now1 = new GregorianCalendar(); // UPCAST

		int y = now.get(Calendar.YEAR);// 년
		int m = now.get(Calendar.MONTH) + 1;// 월(0~11)
		int d = now.get(Calendar.DATE);// 일
		int w = now.get(Calendar.DAY_OF_WEEK);// 주의 수(1~7,1은 일요일)

		System.out.println(y + "-" + m + "-" + d + "-" + w);
		
/*		String pan = null;
		switch (w) {
		case(1): pan = "일";break;
		case(2): pan = "월";break;
		case(3): pan = "화";break;
		case(4): pan = "수";break;
		case(5): pan = "목";break;
		case(6): pan = "금";break;
		case(7): pan = "토";break;
		}
		System.out.println(y + "-" + m + "-" + d + "-" + pan);*/
		
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(y + "-" + m + "-" + d + "-" + week[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		
		System.out.println(startDay + ":" + lastDay);

		System.out.println("---------------");
		
		System.out.printf("%tF\n", now); // 2022-01-04
		System.out.printf("%tT\n", now); // 11:48:17

		System.out.printf("%tF %tT\n", now, now); // 2022-01-04 11:48:17
		System.out.printf("%1$tF %1$tT\n", now); // 2022-01-04 11:48:17
		
		now.set(2021,10-1,10); // m = 9가 10월을 의미
		
		y = now.get(Calendar.YEAR);// 년
		m = now.get(Calendar.MONTH) + 1;// 월(0~11)
		d = now.get(Calendar.DATE);// 일
		w = now.get(Calendar.DAY_OF_WEEK);// 주의 수(1~7,1은 일요일)
		
		System.out.println("---------------");
		
		
		
		startDay = now.getActualMinimum(Calendar.DATE);
		lastDay = now.getActualMaximum(Calendar.DATE);
		
		
		System.out.println(startDay + ":" + lastDay);
		
		
		
		System.out.println("---------------");
		
		
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w - 1]);
		
	}

}
