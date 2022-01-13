package com.day17;

import java.awt.Color;
import java.awt.Frame;

// 이벤트 단위의 프로그램
// AWT

public class Test1 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test1() {
		setTitle("자바윈도우");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0)); // RGB컬러

		setVisible(true);

	}

	public static void main(String[] args) {

		new Test1();

	}

}
