package com.day17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test3 extends Frame {

	public Test3() {

		setTitle("�ڹ� ������");
		setSize(300, 300);

		// addWindowListener(new MyWindowAdapter()); //

		addWindowListener(new WindowAdapter() { // ������ Ŭ����
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setVisible(true);
	}

	/*class MyWindowAdapter extends WindowAdapter { // �����ʴ� �������̵� �޼ҵ�� �Ⱥ��̰�

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}*/

	public static void main(String[] args) {
		new Test3();
	
	}

}
