package com.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;

	public Test2() {
		setTitle("자바 윈도우");
		setSize(300, 300);

		addWindowListener(this); // 사용자가 뭘 하는지 귀기울이고 있는 사람, 감시자, cctv
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void windowActivated(WindowEvent e) { // 창을 앞뒤로 옮김 : 다른 창과 자바창
	}

	@Override
	public void windowClosed(WindowEvent e) { // 창 끄기
	}

	@Override
	public void windowClosing(WindowEvent e) { // 종료 전 저장할지 물어보는 것
		
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) { // 창을 앞뒤로 옮김 : 다른 창과 자바창
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) { // 창이 처음 열릴 때
	}

}
