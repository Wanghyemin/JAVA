package com.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientTest {

	public static void main(String[] args) {

		int port = 7777;
		String host = "192.168.16.26";
		Socket sc = null;

		ObjectOutputStream oos = null;

		Scanner scn = new Scanner(System.in);

		String filePath;

		try {

			System.out.print("������ ���� ��� �� ���ϸ�?.."); // d:\\doc\\test.txt
			filePath = scn.next();

			File f = new File(filePath);

			if (!f.exists()) {

				System.out.println("������ �����ϴ�..");
				System.exit(0);

			}

			sc = new Socket(host, port);

			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();

			FileInfo info;

			// ���� ���� ����
			info = new FileInfo();
			info.setCode(100); // ���� ���� ���� (�����̸�)
			info.setData(f.getName().getBytes());
			info.setSize((int) f.length());

			oos.writeObject(info);
			System.out.println(f.getName() + "���� ���� ����..");

			Thread.sleep(30);

			// ���� ���� ����
			FileInputStream fis = new FileInputStream(f);

			int data = 0;
			byte[] buffer = new byte[1024];

			while ((data = fis.read(buffer, 0, 1024)) != -1) {

				info = new FileInfo();

				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);

				oos.writeObject(info);
				System.out.println(data + "Byte ������...");

				buffer = new byte[1024];

				Thread.sleep(300);

			}

			fis.close();

			// ���� ���� ����
			info = new FileInfo();
			info.setCode(200); // ���� ���� ���� (�����̸�)
			info.setData(f.getName().getBytes());
			info.setSize((int) f.length());

			oos.writeObject(info);
			System.out.println(f.getName() + "���� ���� ����..");

			Thread.sleep(30);

			oos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}