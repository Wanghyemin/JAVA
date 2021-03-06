package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 사용자에게 년,월,일을 입력받아 x일후 년월일(요일)
		/*
		 * 년도?2016 월?4 일?20 몇일후?100
		 * 
		 * 만 난 날 : 2016년 4월 20일 수요일 100일 후 : 2016년 7월 29일 금요일
		 */

		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int y, m, d, x, lastday;

		do {
			System.out.print("연도?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		now.set(Calendar.YEAR, y);
		now.set(Calendar.MONTH, m - 1);

		lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);

		do {
			System.out.print("일?");
			d = sc.nextInt();
		} while (d < 1 || d > lastday);
		d = now.get(Calendar.DATE);

		System.out.print("x일 후");
		x = sc.nextInt();

		now.set(Calendar.YEAR, y);
		now.set(Calendar.MONTH, m - 1);

		lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);

		do {
			System.out.print("일?");
			d = sc.nextInt();
		} while (d < 1 || d > lastday);

		System.out.print("x일 후");
		x = sc.nextInt();

		System.out.println(lastday);

		int w = now.get(Calendar.DAY_OF_WEEK) - 1;

		String[] str = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.printf("만 난 날 : %d년 %d월 %d일 %s요일 ", y, m, d, str[w]);

		now.add(Calendar.DAY_OF_MONTH, x);
		/* now.set(y,m-1,d+x); */

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println();
		System.out.printf("%d일 후 : %d년 %d월 %d일 %s요일 ", x, y, m, d, str[w]);

	}

}


/*Scanner sc = new Scanner(System.in);

Calendar now = Calendar.getInstance();

String[] yoil = {"일","월","화","수","목","금","토"};
				
int y,m,d,i,w,nal;

do{
	System.out.print("년도?");
	y = sc.nextInt();
}while(y<1);

do{
	System.out.print("월?");
	m = sc.nextInt();
}while(m<1||m>12);

do{
	System.out.print("일?");
	d = sc.nextInt();
}while(d<1||d>31);
		
do{
	System.out.print("몇일후?");
	nal = sc.nextInt();
}while(nal<1);

now.set(y, m-1, d);		

w = now.get(Calendar.DAY_OF_WEEK);

System.out.printf("만난날 : %d년 %d월 %d일 %s요일\n",
		y,m,d,yoil[w-1]);

now.add(Calendar.DATE, nal);		

y = now.get(Calendar.YEAR);
m = now.get(Calendar.MONTH)+1;
d = now.get(Calendar.DATE);
w = now.get(Calendar.DAY_OF_WEEK);

System.out.printf("%d일 후 : %d년 %d월 %d일 %s요일\n",
		nal,y,m,d,yoil[w-1]);*/