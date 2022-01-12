package com.day16;

import java.io.File;
import java.io.FileFilter;

class MyFileList implements FileFilter {

	private File f;

	public MyFileList(String filePath) { // ������ ����

		f = new File(filePath);

	}

	public void result() {

		try {

			if (!f.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�");
				return;
			}

			System.out.println("������: " + f.getAbsolutePath());
			System.out.println("����ũ��: " + f.length());

			String p = System.getProperty("user.dir");
			System.out.println("���� ������Ʈ ���: " + p);

			// ����
			if (f.isDirectory()) {

				// ����,���� ����
				File[] lists = f.listFiles(this); //accept

				System.out.println("������ ����...");

				for (int i = 0; i < lists.length; i++) {

					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());

				}

			}

			System.out.println("�� ��Ƽ�� �̸�...");
			File[] root = File.listRoots();
			for (int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
	}

}

public class Test14 {

	public static void main(String[] args) {

		MyFileList m = new MyFileList("c:\\windows");
		m.result();
		 
	}

}
