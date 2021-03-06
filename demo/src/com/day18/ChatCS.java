package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatCS extends Frame implements Runnable, ActionListener {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.111.111.111";
	private int port = 7777;
	private String userName = "혜민";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	// TCP/IP : 인터넷 대표 프로토콜 / TCP 데이터가 맞게 들어왔는지 확인 IP 데이터를 보내는 역할 원거리
	// UDP : 프로토콜, 근거리 통신망, 보내는데 데이터가 맞게 들어왔는지 확인은 안함

	// DatagramSocket : UDP로 데이타그램 패킷을 전송하거나 수신
	// DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터
	// MulticastSocket : 다수의 클라이언트에 데이터그램을 전송
	// D class범위 : 224.0.0.0 ~ 239.255.255.255

	public ChatCS() {

		ta.setEditable(false);
		add(ta, BorderLayout.CENTER);

		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("그룹채팅[" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {
		try {

			xGroup = InetAddress.getByName(host); // ip
			ms = new MulticastSocket(port); // port

			// 특정 그룹에 포함
			ms.joinGroup(xGroup);

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void disConnect() {

		try {

			ms.leaveGroup(xGroup);
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) {

		new ChatCS().setup();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		if(str.equals("")) {
			return;
		}
		byte[] buffer = (userName + "]"+str).getBytes(); // 나갈때 String 으로 못나가서 Byte로 바꿈
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			
			ms.send(dp);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			System.out.println(e2.toString());
		}
		
	}

	@Override
	public void run() {
		
		try {
			while(true) {
				
				byte[] buffer = new byte[512];
				
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				ta.append(str+"\r\n");
				
				
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect();
		}
		
		
		
		
		
		
		
		
		
	}

}
