package com.day10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		// Calendar now1 = new GregorianCalendar(); // UPCAST

		int y = now.get(Calendar.YEAR);// ��
		int m = now.get(Calendar.MONTH) + 1;// ��(0~11)
		int d = now.get(Calendar.DATE);// ��
		int w = now.get(Calendar.DAY_OF_WEEK);// ���� ��(1~7,1�� �Ͽ���)

		System.out.println(y + "-" + m + "-" + d + "-" + w);
		
/*		String pan = null;
		switch (w) {
		case(1): pan = "��";break;
		case(2): pan = "��";break;
		case(3): pan = "ȭ";break;
		case(4): pan = "��";break;
		case(5): pan = "��";break;
		case(6): pan = "��";break;
		case(7): pan = "��";break;
		}
		System.out.println(y + "-" + m + "-" + d + "-" + pan);*/
		
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println(y + "-" + m + "-" + d + "-" + week[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		
		System.out.println(startDay + ":" + lastDay);

		System.out.println("---------------");
		
		System.out.printf("%tF\n", now); // 2022-01-04
		System.out.printf("%tT\n", now); // 11:48:17

		System.out.printf("%tF %tT\n", now, now); // 2022-01-04 11:48:17
		System.out.printf("%1$tF %1$tT\n", now); // 2022-01-04 11:48:17
		
		now.set(2021,9-1,10); // m = 9�� 10���� �ǹ�
		
		y = now.get(Calendar.YEAR);// ��
		m = now.get(Calendar.MONTH) + 1;// ��(0~11)
		d = now.get(Calendar.DATE);// ��
		w = now.get(Calendar.DAY_OF_WEEK);// ���� ��(1~7,1�� �Ͽ���)
		
		System.out.println("---------------");
		
		
		
		startDay = now.getActualMinimum(Calendar.DATE);
		lastDay = now.getActualMaximum(Calendar.DATE);
		
		
		System.out.println(startDay + ":" + lastDay);
		
		
		
		System.out.println("---------------");
		
		
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w - 1]);
		
	}

}