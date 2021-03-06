package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Test5 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;

	public Test5() {

		ta = new TextArea();
		add(ta);

		tf = new TextField();
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("HTML Viewer");
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test5();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			String str;
			URL url = new URL(tf.getText());// url : http(하이퍼텍스트트랜스퍼프로토콜) www.naver.com 

			ta.setText("");
			
			// 방법1
			//InputStream is = url.openStream(); // 빨대로
			
			
			//방법2
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));// bufferedreader 가 사람이 읽을 수 있도록

			while ((str = br.readLine()) != null) { // br.readline은 한줄씩 읽음

				if (ta.getText().equals(""))
					ta.setText(str);
				else
					ta.setText(ta.getText() + "\n\r" + str);
			}

			is.close();

		} catch (Exception e2) {
			// TODO: handle exception
		}

	}

}
