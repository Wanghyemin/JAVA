package com.day4;

//package 안에 있는 class가 아닐때, import된다.
import com.day5.Rect;

public class Test6 { // day5 :Class 생성

	public static void main(String[] args) {

		Rect usa = new Rect();

		usa.input();
		int aa = usa.area();
		int ll = usa.area();
		usa.print(aa, ll);

	}

}
