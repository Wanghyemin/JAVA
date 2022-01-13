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
		btn = new Button("�߰�");

		add(tf,BorderLayout.NORTH); // �߰��ϴ� �ڹ��� �⺻ ���̾ƿ�
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		
		setTitle("������");
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
	public void actionPerformed(ActionEvent e) { // �̺�Ʈ�� �����ϴ� �޼ҵ�
		
		Object ob = e.getSource(); // �ȿ� � �ڷ����� �ִ��� �𸣱� ������ Object�� ���� // getSource �ȿ� �ִ� �ҽ��� �ҷ���
		
		if(ob instanceof Button || ob instanceof TextField) {
			
			String str = tf.getText();
			
			if(!str.equals("")) { // �ƹ��͵� �Է� ���ϸ� �ƹ��� ������ ���� �ʴ´�
				
				ta.append(str+"\r\n"); // \r\n�� ����
				
				tf.setText("");
				tf.requestFocus();
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}