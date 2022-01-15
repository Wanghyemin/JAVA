package com.day17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test3 extends Frame {

	public Test3() {

		setTitle("자바 윈도우");
		setSize(300, 300);

		// addWindowListener(new MyWindowAdapter()); //

		addWindowListener(new WindowAdapter() { // 무명의 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setVisible(true);
	}

	/*class MyWindowAdapter extends WindowAdapter { // 쓰지않는 오버라이드 메소드는 안보이게

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}*/

	public static void main(String[] args) {
		new Test3();
	
	}

}
