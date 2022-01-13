package com.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf;

	public Test4() {

		tf = new TextField();
		ta = new TextArea();
		btn = new Button("추가");

		add(tf,BorderLayout.NORTH); // 추가하는 자바의 기본 레이아웃
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		
		setTitle("윈도우");
		setSize(300, 300);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);

	}

	public static void main(String[] args) {

		new Test4();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트로 실행하는 메소드
		
		Object ob = e.getSource(); // 안에 어떤 자료형이 있는지 모르기 때문에 Object로 받음 // getSource 안에 있는 소스를 불러와
		
		if(ob instanceof Button || ob instanceof TextField) {
			
			String str = tf.getText();
			
			if(!str.equals("")) { // 아무것도 입력 안하면 아무런 실행이 되지 않는다
				
				ta.append(str+"\r\n"); // \r\n은 엔터
				
				tf.setText("");
				tf.requestFocus();
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
