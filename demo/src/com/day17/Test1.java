package com.day17;

import java.awt.Color;
import java.awt.Frame;

// �̺�Ʈ ������ ���α׷�
// AWT

public class Test1 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test1() {
		setTitle("�ڹ�������");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0)); // RGB�÷�

		setVisible(true);

	}

	public static void main(String[] args) {

		new Test1();

	}

}
