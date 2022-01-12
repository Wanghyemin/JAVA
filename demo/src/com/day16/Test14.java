package com.day16;

import java.io.File;
import java.io.FileFilter;

class MyFileList implements FileFilter {

	private File f;

	public MyFileList(String filePath) { // 의존성 주입

		f = new File(filePath);

	}

	public void result() {

		try {

			if (!f.exists()) {
				System.out.println("파일이 존재하지 않습니다");
				return;
			}

			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("파일크기: " + f.length());

			String p = System.getProperty("user.dir");
			System.out.println("현재 프로젝트 경로: " + p);

			// 폴더
			if (f.isDirectory()) {

				// 파일,폴더 구조
				File[] lists = f.listFiles(this); //accept

				System.out.println("폴더의 내용...");

				for (int i = 0; i < lists.length; i++) {

					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());

				}

			}

			System.out.println("각 파티션 이름...");
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
